// Generated from Calculette.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, WS=28, TYPE=29, BOOLEAN=30, RETURN=31, IDENTIFIANT=32, 
		ENTIER=33, DOUBLE=34, NEWLINE=35, UNMATCH=36;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_instruction = 2, RULE_expression = 3, 
		RULE_loop = 4, RULE_branchement = 5, RULE_condition = 6, RULE_function = 7, 
		RULE_params = 8, RULE_args = 9, RULE_bloc = 10, RULE_namedFunction = 11, 
		RULE_decl = 12, RULE_assignation = 13, RULE_finInstruction = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "instruction", "expression", "loop", "branchement", 
			"condition", "function", "params", "args", "bloc", "namedFunction", "decl", 
			"assignation", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'('", "')'", "'/'", "'*'", "'while'", "'for'", "';'", 
			"'repeat'", "'until'", "'if'", "'else'", "'&&'", "'||'", "'!'", "'='", 
			"'<'", "'>'", "'fun'", "':'", "','", "'{'", "'}'", "'read'", "'write'", 
			"'var'", null, null, null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WS", "TYPE", "BOOLEAN", "RETURN", "IDENTIFIANT", 
			"ENTIER", "DOUBLE", "NEWLINE", "UNMATCH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private TablesSymboles tablesSymboles = new TablesSymboles();
		private int _cur_label = 1;
		private String getNewLabel() { return "label" + (_cur_label++);}

	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			calcul();
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public FunctionContext function;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(33);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "JUMP Main\n"; 
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					match(NEWLINE);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(48);
				((CalculContext)_localctx).function = function();
				 _localctx.code += ((CalculContext)_localctx).function.code; 
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					match(NEWLINE);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL Main\n"; 
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << RETURN) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << DOUBLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(63);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public NamedFunctionContext namedFunction;
		public LoopContext loop;
		public BranchementContext branchement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public NamedFunctionContext namedFunction() {
			return getRuleContext(NamedFunctionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public BranchementContext branchement() {
			return getRuleContext(BranchementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CalculetteParser.RETURN, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__22:
			case IDENTIFIANT:
			case ENTIER:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((InstructionContext)_localctx).expression = expression(0);
				setState(74);
				finInstruction();

							((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
						
				}
				break;
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((InstructionContext)_localctx).namedFunction = namedFunction();

							((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).namedFunction.code;
						
				}
				break;
			case T__6:
			case T__7:
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				((InstructionContext)_localctx).loop = loop();

							((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).loop.code;
						
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				((InstructionContext)_localctx).branchement = branchement();

							((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).branchement.code;
						
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(RETURN);
				setState(87);
				((InstructionContext)_localctx).expression = expression(0);
				setState(88);
				finInstruction();

							AdresseType at = tablesSymboles.getAdresseType("f");
							int adresse = at.adresse; 
							((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code + "STOREL " + adresse + "\n" + "RETURN\n";	
						
				}
				break;
			case T__8:
			case NEWLINE:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				finInstruction();

							((InstructionContext)_localctx).code = "";
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public Token op;
		public ExpressionContext par;
		public BlocContext bloc;
		public AssignationContext assignation;
		public Token IDENTIFIANT;
		public ArgsContext args;
		public Token DOUBLE;
		public Token ENTIER;
		public ExpressionContext b;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(CalculetteParser.DOUBLE, 0); }
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				((ExpressionContext)_localctx).a = expression(10);

						if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).charAt(0) == '-'){
							((ExpressionContext)_localctx).code =  "PUSHI 0\n" + ((ExpressionContext)_localctx).a.code + "SUB\n";
						} else {
							((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code;
						}
					
				}
				break;
			case 2:
				{
				setState(101);
				match(T__2);
				setState(102);
				((ExpressionContext)_localctx).par = expression(0);
				setState(103);
				match(T__3);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).par.code;
				}
				break;
			case 3:
				{
				setState(106);
				((ExpressionContext)_localctx).bloc = bloc();
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).bloc.code;
				}
				break;
			case 4:
				{
				setState(109);
				((ExpressionContext)_localctx).assignation = assignation();
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).assignation.code;
				}
				break;
			case 5:
				{
				setState(112);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(113);
				match(T__2);
				setState(114);
				((ExpressionContext)_localctx).args = args();
				setState(115);
				match(T__3);

						((ExpressionContext)_localctx).code =  "PUSHI 0\n" + ((ExpressionContext)_localctx).args.code + "CALL " + (((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null) + "\n";
						int size = ((ExpressionContext)_localctx).args.size;
						for(int i=0; i<size; i++){
							_localctx.code += "POP\n";
						}
					
				}
				break;
			case 6:
				{
				setState(118);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

						AdresseType at = tablesSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
						int adresse = at.adresse;
						if(adresse >= 0){
							((ExpressionContext)_localctx).code =  "PUSHG " + adresse + "\n";
							if(at.type.equals("double")){
								_localctx.code += "PUSHG " + (adresse+1) + "\n";
							}
						} else {
							((ExpressionContext)_localctx).code =  "PUSHL " + adresse + "\n";
							if(at.type.equals("double")){
								_localctx.code += "PUSHL " + (adresse+1) + "\n";
							}
						}
					
				}
				break;
			case 7:
				{
				setState(120);
				((ExpressionContext)_localctx).DOUBLE = match(DOUBLE);
				((ExpressionContext)_localctx).code =  "PUSHF " + (((ExpressionContext)_localctx).DOUBLE!=null?((ExpressionContext)_localctx).DOUBLE.getText():null) + "\n";
				}
				break;
			case 8:
				{
				setState(122);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);
				((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						((ExpressionContext)_localctx).b = expression(9);
						if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).charAt(0) == '/'){
						          			if(!(((ExpressionContext)_localctx).b.code.equals("PUSHI 0"))){
						          				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "DIV\n";
						          			}
						          		} else {
						          				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "MUL\n";
						          		}
						          	
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(132);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						((ExpressionContext)_localctx).b = expression(8);

						          		if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).charAt(0) == '+'){
						          			((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "ADD\n";
						          		} else {
						          			((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "SUB\n";
						          		}
						          	
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public AssignationContext init;
		public AssignationContext incr;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__6);
				setState(142);
				match(T__2);
				setState(143);
				((LoopContext)_localctx).condition = condition(0);
				setState(144);
				match(T__3);
				setState(145);
				((LoopContext)_localctx).instruction = instruction();

						String labelStart = getNewLabel();
						String labelEnd = getNewLabel();
						((LoopContext)_localctx).code =  "LABEL " + labelStart + "\n" + ((LoopContext)_localctx).condition.code + "JUMPF " + labelEnd + "\n" + ((LoopContext)_localctx).instruction.code + "JUMP " + labelStart +"\n" + "LABEL " + labelEnd + "\n";
					
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__7);
				setState(149);
				match(T__2);
				setState(150);
				((LoopContext)_localctx).init = assignation();
				setState(151);
				match(T__8);
				setState(152);
				((LoopContext)_localctx).condition = condition(0);
				setState(153);
				match(T__8);
				setState(154);
				((LoopContext)_localctx).incr = assignation();
				setState(155);
				match(T__3);
				setState(156);
				((LoopContext)_localctx).instruction = instruction();

						String labelStart = getNewLabel();
						String labelEnd = getNewLabel();
						((LoopContext)_localctx).code =  ((LoopContext)_localctx).init.code + "LABEL " + labelStart + "\n" + ((LoopContext)_localctx).condition.code + "JUMPF " + labelEnd + "\n" + ((LoopContext)_localctx).instruction.code + ((LoopContext)_localctx).incr.code + "JUMP " + labelStart + "\n" + "LABEL " + labelEnd + "\n";
					
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__9);
				setState(160);
				((LoopContext)_localctx).instruction = instruction();
				setState(161);
				match(T__10);
				setState(162);
				match(T__2);
				setState(163);
				((LoopContext)_localctx).condition = condition(0);
				setState(164);
				match(T__3);

						String label = getNewLabel();
						((LoopContext)_localctx).code =  "LABEL " + label + "\n" + ((LoopContext)_localctx).instruction.code + ((LoopContext)_localctx).condition.code + "JUMPF " + label + "\n"; 
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchementContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public InstructionContext exp1;
		public InstructionContext exp2;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public BranchementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBranchement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBranchement(this);
		}
	}

	public final BranchementContext branchement() throws RecognitionException {
		BranchementContext _localctx = new BranchementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branchement);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__11);
				setState(170);
				match(T__2);
				setState(171);
				((BranchementContext)_localctx).condition = condition(0);
				setState(172);
				match(T__3);
				setState(173);
				((BranchementContext)_localctx).instruction = instruction();

						String labelEnd = getNewLabel();
						((BranchementContext)_localctx).code =  ((BranchementContext)_localctx).condition.code + "JUMPF " + labelEnd + "\n" + ((BranchementContext)_localctx).instruction.code + "LABEL " + labelEnd + "\n";
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__11);
				setState(177);
				match(T__2);
				setState(178);
				((BranchementContext)_localctx).condition = condition(0);
				setState(179);
				match(T__3);
				setState(180);
				((BranchementContext)_localctx).exp1 = instruction();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(181);
					match(NEWLINE);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__12);
				setState(188);
				((BranchementContext)_localctx).exp2 = instruction();

						String labelIf = getNewLabel();
						String labelElse = getNewLabel();
						((BranchementContext)_localctx).code =  ((BranchementContext)_localctx).condition.code + "JUMPF " + labelElse + "\n" + ((BranchementContext)_localctx).exp1.code + "JUMP " + labelIf + "\n" + "LABEL " + labelElse + "\n" + ((BranchementContext)_localctx).exp2.code + "LABEL " + labelIf + "\n";
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext c1;
		public ConditionContext condition;
		public Token BOOLEAN;
		public ExpressionContext exp1;
		public Token op;
		public ExpressionContext exp2;
		public ConditionContext c2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(CalculetteParser.BOOLEAN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(194);
				match(T__15);
				setState(195);
				((ConditionContext)_localctx).condition = condition(5);

						((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code + "PUSHI 0\nEQUAL\n"; 
					
				}
				break;
			case 2:
				{
				setState(198);
				((ConditionContext)_localctx).BOOLEAN = match(BOOLEAN);

						if((((ConditionContext)_localctx).BOOLEAN!=null?((ConditionContext)_localctx).BOOLEAN.getText():null).equals("true")){
							((ConditionContext)_localctx).code =  "PUSHI 1\n";
						} else {
							((ConditionContext)_localctx).code =  "PUSHI 0\n";
						}
					
				}
				break;
			case 3:
				{
				setState(200);
				((ConditionContext)_localctx).exp1 = expression(0);
				setState(201);
				((ConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
					((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				match(T__16);
				setState(203);
				((ConditionContext)_localctx).exp2 = expression(0);

						((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).exp1.code + ((ConditionContext)_localctx).exp2.code;
						if((((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null).charAt(0) == '='){
							_localctx.code += "EQUAL\n";
						}else if((((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null).charAt(0) == '!'){
							_localctx.code += "NEQ\n";
						}else if((((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null).charAt(0) == '<'){
							_localctx.code += "INFEQ\n";
						} else {
							_localctx.code += "SUPEQ\n";
						}
					
				}
				break;
			case 4:
				{
				setState(206);
				((ConditionContext)_localctx).exp1 = expression(0);
				setState(207);
				((ConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				((ConditionContext)_localctx).exp2 = expression(0);

						((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).exp1.code + ((ConditionContext)_localctx).exp2.code;
						if((((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null).charAt(0) == '<'){
							_localctx.code += "INF\n";
						} else {
							_localctx.code += "SUP\n";
						}
					
				}
				break;
			case 5:
				{
				setState(211);
				((ConditionContext)_localctx).exp1 = expression(0);
				setState(212);
				match(T__17);
				setState(213);
				match(T__18);
				setState(214);
				((ConditionContext)_localctx).exp2 = expression(0);

						((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).exp1.code + ((ConditionContext)_localctx).exp2.code + "NEQ\n";
					
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.c1 = _prevctx;
						_localctx.c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(219);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(220);
						match(T__13);
						setState(221);
						((ConditionContext)_localctx).c2 = ((ConditionContext)_localctx).condition = condition(8);

						          		((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c1.code + ((ConditionContext)_localctx).c2.code + "MUL\n";
						          	
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.c1 = _prevctx;
						_localctx.c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(224);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(225);
						match(T__14);
						setState(226);
						((ConditionContext)_localctx).c2 = ((ConditionContext)_localctx).condition = condition(7);

						          		((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c1.code + ((ConditionContext)_localctx).c2.code + "ADD\n";
						          	
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public Token TYPE;
		public BlocContext bloc;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		tablesSymboles.newTableLocale();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__19);
			setState(235);
			((FunctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(236);
			match(T__20);
			setState(237);
			((FunctionContext)_localctx).TYPE = match(TYPE);

						((FunctionContext)_localctx).code =  "LABEL " + (((FunctionContext)_localctx).IDENTIFIANT!=null?((FunctionContext)_localctx).IDENTIFIANT.getText():null) + "\n";

						if((((FunctionContext)_localctx).TYPE!=null?((FunctionContext)_localctx).TYPE.getText():null).equals("int")){
							tablesSymboles.putVar("f","int");
						} else {
							tablesSymboles.putVar("f","double");
						}

					
			setState(239);
			match(T__2);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(240);
				params();
				}
			}

			setState(243);
			match(T__3);
			setState(244);
			((FunctionContext)_localctx).bloc = bloc();

						_localctx.code += ((FunctionContext)_localctx).bloc.code + "RETURN\n";
					
			}
			_ctx.stop = _input.LT(-1);
			tablesSymboles.dropTableLocale();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public Token TYPE;
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(CalculetteParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalculetteParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalculetteParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalculetteParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(248);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

					if((((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null).equals("int")){
						tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),"int");
					} else {
						tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),"double");
					}
				
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(250);
				match(T__21);
				setState(251);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(252);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

							if((((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null).equals("int")){
								tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),"int");
							} else {
								tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null),"double");
							}
						
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__22) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << DOUBLE))) != 0)) {
				{
				setState(259);
				((ArgsContext)_localctx).expression = expression(0);

							_localctx.code += ((ArgsContext)_localctx).expression.code;
							_localctx.size ++;
						
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(261);
					match(T__21);
					setState(262);
					((ArgsContext)_localctx).expression = expression(0);

									_localctx.code += ((ArgsContext)_localctx).expression.code;
									_localctx.size ++;
								
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__22);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << RETURN) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << DOUBLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(273);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(T__23);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(NEWLINE);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedFunctionContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterNamedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitNamedFunction(this);
		}
	}

	public final NamedFunctionContext namedFunction() throws RecognitionException {
		NamedFunctionContext _localctx = new NamedFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namedFunction);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__24);
				setState(289);
				match(T__2);
				setState(290);
				((NamedFunctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(291);
				match(T__3);


						AdresseType at = tablesSymboles.getAdresseType((((NamedFunctionContext)_localctx).IDENTIFIANT!=null?((NamedFunctionContext)_localctx).IDENTIFIANT.getText():null));
						int adresse = at.adresse; 
						String type = at.type;

						if(type.equals("int")){
							((NamedFunctionContext)_localctx).code =  "READ \n";
						} else {
							((NamedFunctionContext)_localctx).code =  "READF \n";
						}
						

						if(adresse >= 0){
							_localctx.code += "STOREG " + adresse + "\n";
						} else {
							_localctx.code += "STOREL " + adresse + "\n";
						}
					
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(T__25);
				setState(294);
				match(T__2);
				setState(295);
				((NamedFunctionContext)_localctx).expression = expression(0);
				setState(296);
				match(T__3);

						((NamedFunctionContext)_localctx).code =  ((NamedFunctionContext)_localctx).expression.code + "WRITE\nPOP\n"; 
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public Token TYPE;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decl);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__26);
				setState(302);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(303);
				match(T__20);
				setState(304);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(305);
				finInstruction();

							if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){
								tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
								((DeclContext)_localctx).code =  "PUSHI 0\n";
							} else {
								tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"double");
								((DeclContext)_localctx).code =  "PUSHF 0.0\n";
							}
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__26);
				setState(309);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(310);
				match(T__20);
				setState(311);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(312);
				match(T__16);
				setState(313);
				((DeclContext)_localctx).expression = expression(0);
				setState(314);
				finInstruction();

							if((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){
								tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
								((DeclContext)_localctx).code =  ((DeclContext)_localctx).expression.code;
							} else {
								tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"double");
								((DeclContext)_localctx).code =  ((DeclContext)_localctx).expression.code;
							}
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public Token op;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignation);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(320);
				match(T__16);
				setState(321);
				((AssignationContext)_localctx).expression = expression(0);
				  
							AdresseType at = tablesSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
							int adresse = at.adresse;
							if(adresse >= 0){
								((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code + "STOREG " + adresse + "\n";
							} else {
								((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code + "STOREL " + adresse + "\n";
							}
							
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(325);
				((AssignationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5))) != 0)) ) {
					((AssignationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(326);
				match(T__16);
				setState(327);
				((AssignationContext)_localctx).expression = expression(0);

						AdresseType at = tablesSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
						int adresse = at.adresse;
						if(adresse >= 0){
							((AssignationContext)_localctx).code =  "PUSHG " + adresse + "\n";
						} else {
							((AssignationContext)_localctx).code =  "PUSHL " + adresse + "\n";
						}
						if((((AssignationContext)_localctx).op!=null?((AssignationContext)_localctx).op.getText():null).charAt(0) == '/'){
							_localctx.code += ((AssignationContext)_localctx).expression.code + "DIV\n";
						} else if ((((AssignationContext)_localctx).op!=null?((AssignationContext)_localctx).op.getText():null).charAt(0) == '*'){
							_localctx.code += ((AssignationContext)_localctx).expression.code + "MUL\n";
						} else if((((AssignationContext)_localctx).op!=null?((AssignationContext)_localctx).op.getText():null).charAt(0) == '+'){
							_localctx.code += ((AssignationContext)_localctx).expression.code + "ADD\n";
						} else {
							_localctx.code += ((AssignationContext)_localctx).expression.code + "SUB\n";
						}
						_localctx.code += "STOREG " + adresse + "\n";
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(332);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3"+
		"\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00aa\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00b9\n\7\f\7\16\7\u00bc\13\7\3\7\3\7\3\7\3\7\5\7\u00c2"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00dc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00e8\n\b\f\b\16\b\u00eb\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00f4\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0101"+
		"\n\n\f\n\16\n\u0104\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u010c\n\13"+
		"\f\13\16\13\u010f\13\13\5\13\u0111\n\13\3\f\3\f\3\f\3\f\7\f\u0117\n\f"+
		"\f\f\16\f\u011a\13\f\3\f\3\f\7\f\u011e\n\f\f\f\16\f\u0121\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u012e\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0140"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014d"+
		"\n\17\3\20\6\20\u0150\n\20\r\20\16\20\u0151\3\20\2\4\b\16\21\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36\2\b\3\2\3\4\3\2\7\b\3\2\22\25\3\2\24\25"+
		"\4\2\3\4\7\b\4\2\13\13%%\2\u016b\2 \3\2\2\2\4(\3\2\2\2\6`\3\2\2\2\b~\3"+
		"\2\2\2\n\u00a9\3\2\2\2\f\u00c1\3\2\2\2\16\u00db\3\2\2\2\20\u00ec\3\2\2"+
		"\2\22\u00f9\3\2\2\2\24\u0110\3\2\2\2\26\u0112\3\2\2\2\30\u012d\3\2\2\2"+
		"\32\u013f\3\2\2\2\34\u014c\3\2\2\2\36\u014f\3\2\2\2 !\5\4\3\2!\"\7\2\2"+
		"\3\"\3\3\2\2\2#$\5\32\16\2$%\b\3\1\2%\'\3\2\2\2&#\3\2\2\2\'*\3\2\2\2("+
		"&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+/\b\3\1\2,.\7%\2\2-,\3\2\2\2."+
		"\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61/\3\2\2\2\62\63\5\20"+
		"\t\2\63\64\b\3\1\2\64\66\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\7%\2\2;:\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@F\b\3\1\2AB\5\6\4\2BC\b\3\1\2CE\3"+
		"\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\b"+
		"\3\1\2J\5\3\2\2\2KL\5\b\5\2LM\5\36\20\2MN\b\4\1\2Na\3\2\2\2OP\5\30\r\2"+
		"PQ\b\4\1\2Qa\3\2\2\2RS\5\n\6\2ST\b\4\1\2Ta\3\2\2\2UV\5\f\7\2VW\b\4\1\2"+
		"Wa\3\2\2\2XY\7!\2\2YZ\5\b\5\2Z[\5\36\20\2[\\\b\4\1\2\\a\3\2\2\2]^\5\36"+
		"\20\2^_\b\4\1\2_a\3\2\2\2`K\3\2\2\2`O\3\2\2\2`R\3\2\2\2`U\3\2\2\2`X\3"+
		"\2\2\2`]\3\2\2\2a\7\3\2\2\2bc\b\5\1\2cd\t\2\2\2de\5\b\5\fef\b\5\1\2f\177"+
		"\3\2\2\2gh\7\5\2\2hi\5\b\5\2ij\7\6\2\2jk\b\5\1\2k\177\3\2\2\2lm\5\26\f"+
		"\2mn\b\5\1\2n\177\3\2\2\2op\5\34\17\2pq\b\5\1\2q\177\3\2\2\2rs\7\"\2\2"+
		"st\7\5\2\2tu\5\24\13\2uv\7\6\2\2vw\b\5\1\2w\177\3\2\2\2xy\7\"\2\2y\177"+
		"\b\5\1\2z{\7$\2\2{\177\b\5\1\2|}\7#\2\2}\177\b\5\1\2~b\3\2\2\2~g\3\2\2"+
		"\2~l\3\2\2\2~o\3\2\2\2~r\3\2\2\2~x\3\2\2\2~z\3\2\2\2~|\3\2\2\2\177\u008c"+
		"\3\2\2\2\u0080\u0081\f\n\2\2\u0081\u0082\t\3\2\2\u0082\u0083\5\b\5\13"+
		"\u0083\u0084\b\5\1\2\u0084\u008b\3\2\2\2\u0085\u0086\f\t\2\2\u0086\u0087"+
		"\t\2\2\2\u0087\u0088\5\b\5\n\u0088\u0089\b\5\1\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0080\3\2\2\2\u008a\u0085\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\t\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\7\t\2\2\u0090\u0091\7\5\2\2\u0091\u0092\5\16\b\2\u0092\u0093\7\6\2\2"+
		"\u0093\u0094\5\6\4\2\u0094\u0095\b\6\1\2\u0095\u00aa\3\2\2\2\u0096\u0097"+
		"\7\n\2\2\u0097\u0098\7\5\2\2\u0098\u0099\5\34\17\2\u0099\u009a\7\13\2"+
		"\2\u009a\u009b\5\16\b\2\u009b\u009c\7\13\2\2\u009c\u009d\5\34\17\2\u009d"+
		"\u009e\7\6\2\2\u009e\u009f\5\6\4\2\u009f\u00a0\b\6\1\2\u00a0\u00aa\3\2"+
		"\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\7\r\2\2\u00a4"+
		"\u00a5\7\5\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\b"+
		"\6\1\2\u00a8\u00aa\3\2\2\2\u00a9\u008f\3\2\2\2\u00a9\u0096\3\2\2\2\u00a9"+
		"\u00a1\3\2\2\2\u00aa\13\3\2\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\7\5\2"+
		"\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\7\6\2\2\u00af\u00b0\5\6\4\2\u00b0"+
		"\u00b1\b\7\1\2\u00b1\u00c2\3\2\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4\7"+
		"\5\2\2\u00b4\u00b5\5\16\b\2\u00b5\u00b6\7\6\2\2\u00b6\u00ba\5\6\4\2\u00b7"+
		"\u00b9\7%\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7\17\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\b\7\1\2\u00c0\u00c2\3"+
		"\2\2\2\u00c1\u00ab\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c2\r\3\2\2\2\u00c3\u00c4"+
		"\b\b\1\2\u00c4\u00c5\7\22\2\2\u00c5\u00c6\5\16\b\7\u00c6\u00c7\b\b\1\2"+
		"\u00c7\u00dc\3\2\2\2\u00c8\u00c9\7 \2\2\u00c9\u00dc\b\b\1\2\u00ca\u00cb"+
		"\5\b\5\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\7\23\2\2\u00cd\u00ce\5\b\5\2"+
		"\u00ce\u00cf\b\b\1\2\u00cf\u00dc\3\2\2\2\u00d0\u00d1\5\b\5\2\u00d1\u00d2"+
		"\t\5\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4\b\b\1\2\u00d4\u00dc\3\2\2\2\u00d5"+
		"\u00d6\5\b\5\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\5"+
		"\b\5\2\u00d9\u00da\b\b\1\2\u00da\u00dc\3\2\2\2\u00db\u00c3\3\2\2\2\u00db"+
		"\u00c8\3\2\2\2\u00db\u00ca\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d5\3\2"+
		"\2\2\u00dc\u00e9\3\2\2\2\u00dd\u00de\f\t\2\2\u00de\u00df\7\20\2\2\u00df"+
		"\u00e0\5\16\b\n\u00e0\u00e1\b\b\1\2\u00e1\u00e8\3\2\2\2\u00e2\u00e3\f"+
		"\b\2\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5\5\16\b\t\u00e5\u00e6\b\b\1\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\17\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\7\26\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00ef\7\27\2\2"+
		"\u00ef\u00f0\7\37\2\2\u00f0\u00f1\b\t\1\2\u00f1\u00f3\7\5\2\2\u00f2\u00f4"+
		"\5\22\n\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f6\7\6\2\2\u00f6\u00f7\5\26\f\2\u00f7\u00f8\b\t\1\2\u00f8\21"+
		"\3\2\2\2\u00f9\u00fa\7\37\2\2\u00fa\u00fb\7\"\2\2\u00fb\u0102\b\n\1\2"+
		"\u00fc\u00fd\7\30\2\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0101"+
		"\b\n\1\2\u0100\u00fc\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\23\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5\b\5"+
		"\2\u0106\u010d\b\13\1\2\u0107\u0108\7\30\2\2\u0108\u0109\5\b\5\2\u0109"+
		"\u010a\b\13\1\2\u010a\u010c\3\2\2\2\u010b\u0107\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0105\3\2\2\2\u0110\u0111\3\2\2\2\u0111\25\3\2\2"+
		"\2\u0112\u0118\7\31\2\2\u0113\u0114\5\6\4\2\u0114\u0115\b\f\1\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011f\7\32\2\2\u011c\u011e\7%\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\27\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\7\33\2\2\u0123\u0124\7\5\2\2\u0124\u0125\7\"\2\2"+
		"\u0125\u0126\7\6\2\2\u0126\u012e\b\r\1\2\u0127\u0128\7\34\2\2\u0128\u0129"+
		"\7\5\2\2\u0129\u012a\5\b\5\2\u012a\u012b\7\6\2\2\u012b\u012c\b\r\1\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0122\3\2\2\2\u012d\u0127\3\2\2\2\u012e\31\3\2\2"+
		"\2\u012f\u0130\7\35\2\2\u0130\u0131\7\"\2\2\u0131\u0132\7\27\2\2\u0132"+
		"\u0133\7\37\2\2\u0133\u0134\5\36\20\2\u0134\u0135\b\16\1\2\u0135\u0140"+
		"\3\2\2\2\u0136\u0137\7\35\2\2\u0137\u0138\7\"\2\2\u0138\u0139\7\27\2\2"+
		"\u0139\u013a\7\37\2\2\u013a\u013b\7\23\2\2\u013b\u013c\5\b\5\2\u013c\u013d"+
		"\5\36\20\2\u013d\u013e\b\16\1\2\u013e\u0140\3\2\2\2\u013f\u012f\3\2\2"+
		"\2\u013f\u0136\3\2\2\2\u0140\33\3\2\2\2\u0141\u0142\7\"\2\2\u0142\u0143"+
		"\7\23\2\2\u0143\u0144\5\b\5\2\u0144\u0145\b\17\1\2\u0145\u014d\3\2\2\2"+
		"\u0146\u0147\7\"\2\2\u0147\u0148\t\6\2\2\u0148\u0149\7\23\2\2\u0149\u014a"+
		"\5\b\5\2\u014a\u014b\b\17\1\2\u014b\u014d\3\2\2\2\u014c\u0141\3\2\2\2"+
		"\u014c\u0146\3\2\2\2\u014d\35\3\2\2\2\u014e\u0150\t\7\2\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\37\3\2\2\2\33(/\67=F`~\u008a\u008c\u00a9\u00ba\u00c1\u00db\u00e7\u00e9"+
		"\u00f3\u0102\u010d\u0110\u0118\u011f\u012d\u013f\u014c\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}