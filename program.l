%{
#include <stdio.h>
%}
HEXADECIMAL O[xX][0-9a-fA-F]+
OCTAL O[0-7]+
%%
{HEXADECIMAL}    { printf("Hexadecimal: %s\n", yytext); }
{OCTAL}          { printf("Octal: %s\n", yytext); }
%%

int main(int argc, char *argv[]) {
    if (argc > 1) {
        yyin = fopen(argv[1], "r");
    }
    else {
        yyin = stdin;
    }
    yylex();
    return 0;
}

int yywrap() {
    return 1;
}