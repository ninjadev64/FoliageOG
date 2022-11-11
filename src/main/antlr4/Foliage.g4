grammar Foliage;

program : line+ ;
line : (operation)? ';' ;
operation : ((integer operator)+ integer) ;

operator : ('+' | '-' | '*' | '/') ;
integer : DIGIT+ ;
string : (LETTER | DIGIT)+ ;

fragment
LETTER : [A-Za-z] ;
DIGIT : [0-9] ;
WS : ('\t' | '\r' | '\n') -> skip ;