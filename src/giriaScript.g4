grammar giriaScript;

COD: 'codigo';
TIPOS: 'firme' | 'mole' | 'duascara' | 'letrinha';
ARIT: 'junta' | 'tira' | 'mutiprica' | 'racha';
ATRIB: '<-';
DF: 'essevorta' | 'essenumvorta';
ER: 'repete';
EC: 'Vo' | 'numVo' | 'vonumvo';
ESC: 'lequemSabe';
LEIT: 'mandaAi';
AB: '{';
FB: '}';
AP: '(';
FP: ')';
FL: '|';
LOGIC: 'and' | 'or' | 'not';
RELAC: 'engual' | 'taChapano' | 'dmaior' | 'dmenor'; //operadores de comparação
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO)?;
BOOL: 'dboa' | 'judas';
STR: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
WS: [ \t\r\n]+ -> skip;
ERROR: .;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

start: (declaracao algoritmo)? EOF #Inicializacao;
declaracao: COD ID #BlocoInicial;
algoritmo: AB (instr)+ FB #BlocoFuncional;
instr: (atrib | interc | acao) #Funcionalidades;
atrib: (TIPOS ID ATRIB valores FL
     | TIPOS ID FL
     | ID ATRIB operacao FL) #Atribuicao;
interc: (ESC ID FL  //Escreve
    | LEIT ID FL) #Interacao; //Lê
acao: (ER AP condicao FP algoritmo //Loop
    | EC AP condicao FP algoritmo) #Funcao ;//Condiconal
valores: (ID | NUM | BOOL | STR) #TiposValores; // valor a ser atribuido
operacao:(valores (ARIT operando_cauda)*) #OperacaoMaquina;
operando_cauda: valores #OperacaoMaquinaFim;
condicao: (valores RELAC valores (LOGIC condicao)?) #OperacaoCondicinaMaquina;