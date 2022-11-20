grammar Foliage;

program : (method)+ ;
method : type=.*? ' '+ name=.*? ' '+? '{' statement+? '}' ;
statement : (intOperation | floatOperation | declaration | return) ';' ;
intOperation : ((integer | variable) operator)+ (integer | variable) ;
floatOperation : ((float | variable) operator)+ (float | variable) ;
declaration : type=.*? ' '+ name=.*? ' '+? '=' ' '+? val=value ;
return : 'return ' val=value ;

operator : ('+' | '-' | '*' | '/') ;
integer : Number ;
float : Number | (Number 'f') | (Number '.' Number) ;
variable : Text ;
string : '"' Text '"' ;
value : integer | float | string ;

Number : DIGIT+ ;
Text : LETTER+ ;

fragment
LETTER : [A-Za-z] ;
DIGIT : [0-9] ;
WS : ('\t' | '\r' | '\n') -> skip ;