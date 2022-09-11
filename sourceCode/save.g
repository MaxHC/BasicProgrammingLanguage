 grammar Calculette;

//TODO support float

@members {
	private TablesSymboles tablesSymboles = new TablesSymboles();
	private int _cur_label = 1;
	private String getNewLabel() { return "label" + (_cur_label++);}
}

start
	: calcul EOF;

calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise code, pour ensuite l'utiliser comme accumulateur
@after{ System.out.println($code); }
	:	(decl { $code += $decl.code; })* 
		{ $code += "JUMP Main\n"; }
        NEWLINE*
        
        (function { $code += $function.code; })* 
        NEWLINE*
        
        { $code += "LABEL Main\n"; }
        (instruction { $code += $instruction.code; })*

        { $code += "HALT\n"; } 
	;

instruction returns [ String code ]
	: expression finInstruction
		{
			$code = $expression.code;
		}
	| namedFunction 
		{
			$code = $namedFunction.code;
		}
	| loop
		{
			$code = $loop.code;
		}
	| branchement
		{
			$code = $branchement.code;
		}
	| RETURN expression finInstruction
		{
			AdresseType at = tablesSymboles.getAdresseType("f");
			int adresse = at.adresse; 
			$code = $expression.code + "STOREL " + adresse + "\n" + "RETURN\n";	
		}
	| finInstruction
		{
			$code="";
		}
	;

expression returns [ String code ]
	: op = ('+'|'-') a=expression {
		if($op.text.charAt(0) == '-'){
			$code = "PUSHI 0\n" + $a.code + "SUB\n";
		} else {
			$code = $a.code;
		}
	}
	| '(' par=expression ')' {$code = $par.code;}
	| a=expression op=('/'|'*') b=expression
		{if($op.text.charAt(0) == '/'){
			if(!($b.code.equals("PUSHI 0"))){
				$code = $a.code + $b.code + "DIV\n";
			}
		} else {
				$code = $a.code + $b.code + "MUL\n";
		}
	}
	| a=expression op=('+'|'-') b=expression {
		if($op.text.charAt(0) == '+'){
			$code = $a.code + $b.code + "ADD\n";
		} else {
			$code = $a.code + $b.code + "SUB\n";
		}
	}
	| bloc {$code = $bloc.code;}
	| assignation {$code = $assignation.code;}
	| IDENTIFIANT '(' args ')' {
		$code = "PUSHI 0\n" + $args.code + "CALL " + $IDENTIFIANT.text + "\n";
		int size = $args.size;
		for(int i=0; i<size; i++){
			$code += "POP\n";
		}
	}
	| IDENTIFIANT {
		AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
		int adresse = at.adresse;
		if(adresse >= 0){
			$code = "PUSHG " + adresse + "\n";
			if(at.type.equals("double")){
				$code += "PUSHG " + (adresse+1) + "\n";
			}
		} else {
			$code = "PUSHL " + adresse + "\n";
			if(at.type.equals("double")){
				$code += "PUSHL " + (adresse+1) + "\n";
			}
		}
	}
	| DOUBLE {$code = "PUSHF " + $DOUBLE.text + "\n";}
	| ENTIER {$code = "PUSHI " + $ENTIER.text + "\n";} //add float support
	;

loop returns [ String code ] //maybe opti later
	: 'while' '(' condition ')' instruction {
		String LabelDebut = getNewLabel();
		String LabelFin = getNewLabel();
		$code = "LABEL " + LabelDebut + "\n" + $condition.code + "JUMPF " + LabelFin + "\n" + $instruction.code + "JUMP " + LabelDebut +"\n" + "LABEL " + LabelFin + "\n";
	}
	| 'for' '(' init=assignation ';' condition ';' incr=assignation ')' instruction {
		String label = getNewLabel();
		String labelEnd = getNewLabel();
		$code = $init.code + "LABEL " + label + "\n" + $condition.code + "JUMPF " + labelEnd + "\n" + $instruction.code + $incr.code + "JUMP " + label + "\n" + "LABEL " + labelEnd + "\n";
	}
	| 'repeat' instruction 'until' '(' condition ')' {
		String label = getNewLabel();
		String labelEnd = getNewLabel();
		$code = "LABEL " + label + "\n" + $instruction.code + $condition.code + "JUMPF " + label + "\n"; 
	}
	;

branchement returns [ String code ] //maybe opti later
	: 'if' '(' condition ')' instruction {
		String LabelFin = getNewLabel();
		$code = $condition.code + "JUMPF " + LabelFin + "\n" + $instruction.code + "LABEL " + LabelFin + "\n";
	}
	| 'if' '(' condition ')' exp1=instruction NEWLINE* 'else' exp2=instruction{
		String LabelIf = getNewLabel();
		String LabelElse = getNewLabel();
		$code = $condition.code + "JUMPF " + LabelElse + "\n" + $exp1.code + "JUMP " + LabelIf + "\n" + "LABEL " + LabelElse + "\n" + $exp2.code + "LABEL " + LabelIf + "\n";
	}
	;

condition returns [ String code ]
	: c1=condition '&&' c2=condition {
		$code = $c1.code + $c2.code + "MUL\n";
	}
	| c1=condition '||' c2=condition {
		$code = $c1.code + $c2.code + "ADD\n";
	}
	| '!' condition {
		$code = $condition.code + "PUSHI 0\nEQUAL\n"; 
	}
	| BOOLEAN {
		if($BOOLEAN.text.equals("true")){
			$code = "PUSHI 1\n";
		} else {
			$code = "PUSHI 0\n";
		}
	}
	| exp1=expression op=('='|'!'|'<'|'>')'=' exp2=expression{
		$code = $exp1.code + $exp2.code;
		if($op.text.charAt(0) == '='){
			$code += "EQUAL\n";
		}else if($op.text.charAt(0) == '!'){
			$code += "NEQ\n";
		}else if($op.text.charAt(0) == '<'){
			$code += "INFEQ\n";
		} else {
			$code += "SUPEQ\n";
		}
	}
	| exp1=expression op=('<'|'>') exp2=expression{
		$code = $exp1.code + $exp2.code;
		if($op.text.charAt(0) == '<'){
			$code += "INF\n";
		} else {
			$code += "SUP\n";
		}
	}
	| exp1=expression '<' '>' exp2=expression{
		$code = $exp1.code + $exp2.code + "NEQ\n";
	}
	;

function returns [ String code ]
@init{tablesSymboles.newTableLocale();}//init local table
@after{tablesSymboles.dropTableLocale();}//destroy local table
	: 'fun' IDENTIFIANT ':' TYPE {
			$code = "LABEL " + $IDENTIFIANT.text + "\n";

			if($TYPE.text.equals("int")){
				tablesSymboles.putVar("f","int");
			} else {
				tablesSymboles.putVar("f","double");
			}

		}
		'(' params ? ')' bloc {
			$code += $bloc.code + "RETURN\n";
		}
	;

params
	: TYPE IDENTIFIANT {
		if($TYPE.text.equals("int")){
			tablesSymboles.putVar($IDENTIFIANT.text,"int");
		} else {
			tablesSymboles.putVar($IDENTIFIANT.text,"double");
		}
	}
	( ',' TYPE IDENTIFIANT {
			if($TYPE.text.equals("int")){
				tablesSymboles.putVar($IDENTIFIANT.text,"int");
			} else {
				tablesSymboles.putVar($IDENTIFIANT.text,"double");
			}
		}
	)*
	;

args returns [ String code, int size]
@init {$code = new String(); $size = 0;}
	: ( expression {
			$code += $expression.code;
			$size ++;
		}
		(',' expression {
				$code += $expression.code;
				$size ++;
			}
		)*
	)?
	;

bloc returns [ String code ]
@init{ $code = new String(); }
	: '{' (instruction { $code += $instruction.code; })* '}' NEWLINE*
	;

namedFunction returns [ String code ]
	: 'read' '(' IDENTIFIANT ')' {

		AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
		int adresse = at.adresse; 
		String type = at.type;

		if(type.equals("int")){
			$code = "READ \n";
		} else {
			$code = "READF \n";
		}
		

		if(adresse >= 0){
			$code += "STOREG " + adresse + "\n";
		} else {
			$code += "STOREL " + adresse + "\n";
		}
	}
	| 'write' '(' expression ')' {
		$code = $expression.code + "WRITE\nPOP\n"; 
	}
	;

decl returns [ String code ] 
	: 'var' IDENTIFIANT ':' TYPE  finInstruction
		{
			if($TYPE.text.equals("int")){
				tablesSymboles.putVar($IDENTIFIANT.text,"int");
				$code = "PUSHI 0\n";
			} else {
				tablesSymboles.putVar($IDENTIFIANT.text,"double");
				$code = "PUSHF 0.0\n";
			}
		}
	| 'var' IDENTIFIANT ':' TYPE  '=' expression finInstruction
		{
			if($TYPE.text.equals("int")){
				tablesSymboles.putVar($IDENTIFIANT.text,"int");
				$code = $expression.code;
			} else {
				tablesSymboles.putVar($IDENTIFIANT.text,"double");
				$code = $expression.code;
			}
		}
	; 

assignation returns [ String code ] 
	: IDENTIFIANT '=' expression
		{  
			AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
			int adresse = at.adresse;
			if(adresse >= 0){
				$code = $expression.code + "STOREG " + adresse + "\n";
			} else {
				$code = $expression.code + "STOREL " + adresse + "\n";
			}
			
		}
	| IDENTIFIANT op=('*'|'/'|'+'|'-') '=' expression{
		AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
		int adresse = at.adresse;
		if(adresse >= 0){
			$code = "PUSHG " + adresse + "\n";
		} else {
			$code = "PUSHL " + adresse + "\n";
		}
		if($op.text.charAt(0) == '/'){
			$code += $expression.code + "DIV\n";
		} else if ($op.text.charAt(0) == '*'){
			$code += $expression.code + "MUL\n";
		} else if($op.text.charAt(0) == '+'){
			$code += $expression.code + "ADD\n";
		} else {
			$code += $expression.code + "SUB\n";
		}
		$code += "STOREG " + adresse + "\n";
	}
	;

finInstruction : ( NEWLINE | ';' )+ ;

/**/

// lexer
WS :   (' '|'\t')+  -> skip;

TYPE : 'int' | 'double' ;

BOOLEAN : 'true' | 'false';

RETURN: 'return';

IDENTIFIANT : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

ENTIER : ('0'..'9')+  ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

DOUBLE
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

NEWLINE : ('#' ~('\n'|'\r')*)? '\r'? '\n' | (('%') ~('\n')*) | (('/')('*') .*? ('*')('/'));

UNMATCH : . -> skip;
