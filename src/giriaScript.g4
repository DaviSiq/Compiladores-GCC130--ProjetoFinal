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
RELAC: 'engual' | 'taChapano' | 'dmaior' | 'dmenor';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO)?;
WS: [ \t\r\n]* ->skip;
ERROR: . ;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

