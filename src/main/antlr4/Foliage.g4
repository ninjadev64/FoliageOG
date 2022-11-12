grammar Foliage;

program : (method)+ ;
method : name=string ' '+? '{' statement+ '}' ;
statement : (operation | return) ';' ;
operation : (integer operator)+ integer ;
return : 'return ' value=integer ;


operator : ('+' | '-' | '*' | '/') ;
integer : Number ;
string : Text ;

Number : DIGIT+ ;
Text : LETTER+ ;

fragment
LETTER : [A-Za-z] ;
DIGIT : [0-9] ;
WS : ('\t' | '\r' | '\n') -> skip ;