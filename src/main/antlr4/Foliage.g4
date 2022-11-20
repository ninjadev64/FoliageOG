grammar Foliage;

program : (method)+ ;
method : type=.*? ' '+ name=.*? ' '+? '{' statement+? '}' ;
statement : (intOperation | floatOperation | declaration | return) ';' ;
intOperation : (integer operator)+ integer ;
floatOperation : (float operator)+ float ;
declaration : type=.*? ' '+ name=.*? ' '+? '=' ' '+? value=.*? ;
return : 'return ' value=. ;

operator : ('+' | '-' | '*' | '/') ;
integer : Number ;
float : Number | (Number 'f') | (Number '.' Number) ;
string : Text ;

Number : DIGIT+ ;
Text : LETTER+ ;

fragment
LETTER : [A-Za-z] ;
DIGIT : [0-9] ;
WS : ('\t' | '\r' | '\n') -> skip ;