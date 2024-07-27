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
WS: [ \t\r\n]+ -> skip;
ERROR: .;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

start: (declaracao algoritmo)? EOF;
declaracao: COD ID;
algoritmo: AB (instr)+ FB;
instr: atrib | interc | acao ;
atrib: TIPOS ID ATRIB valores FL
     | TIPOS ID FL
     | ID ATRIB operacao FL;
interc: ESC ID FL  //Escreve
    | LEIT ID FL; //Lê
acao: ER AP condicao FP algoritmo //Loop
    | EC AP condicao FP algoritmo ;//Condiconal
valores: ID | NUM | BOOL; // valor a ser atribuido
operacao: valores (ARIT operando_cauda)*;
operando_cauda: valores;
condicao: valores RELAC valores (LOGIC condicao)?;