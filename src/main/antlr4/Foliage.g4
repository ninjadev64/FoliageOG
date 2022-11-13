grammar Foliage;

program : (method)+ ;
method : type=string ' '+ name=string ' '+? '{' statement+? '}' ;
statement : (intOperation | floatOperation | return) ';' ;
intOperation : (integer operator)+ integer ;
floatOperation : (float operator)+ float ;
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