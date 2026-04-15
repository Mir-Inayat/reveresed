%{
    #include "y.tab.h"
    #include <stdlib.h>     
%}

%%

[0-9]+ {
      yylval = atoi(yytext);
      return NUMBER;     
}

"+" { return PLUS; }
"-" { return MINUS; }

[ \t] { /* ignore whitespace */ }

\n { return ENTER; }

. { return *yytext; }

%%

int yywrap() {
    return 1;
}