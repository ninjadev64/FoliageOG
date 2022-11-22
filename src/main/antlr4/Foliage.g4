grammar Foliage;

program : (method)+ ;
method : type=Id ' '+ name=Id ' '* '{' statement+? '}' ;
statement : (intOperation | floatOperation | declaration | methodCall | externalMethodCall | return) ' '* ';' ;
intOperation : ((integer | variable) operator)+ (integer | variable) ;
floatOperation : ((float | variable) operator)+ (float | variable) ;
declaration : type=Id ' '+ name=Id ' '* '=' ' '* val=value ;
methodCall : name=Id '()' ;
externalMethodCall : klass=Id '.' name=Id '()' ;
return : 'return ' val=value ;

operator : ('+' | '-' | '*' | '/') ;
integer : Number ;
float : Number | (Number 'f') | (Number '.' Number) ;
variable : Id ;
string : '"' Id '"' ;
value : integer | float | string ;

Id : IDEN+ ;
Number : DIGIT+ ;

fragment
IDEN : [A-Za-z_-] ;
DIGIT : [0-9] ;
WS : ('\t' | '\r' | '\n') -> skip ;