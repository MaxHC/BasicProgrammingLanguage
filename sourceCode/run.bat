::grun Calculette "start" < input.txt > output.mvap
java MainCalculette input.txt > output.mvap
java MVaPAssembler output.mvap
java CBaP output.mvap.cbap