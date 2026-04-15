%{
    #include<stdio.h>
    void yyerror(const char *s);
    int yylex();     
%}

%token NUMBER PLUS MINUS ENTER
%left PLUS MINUS

%%

input:
    | input line
    ;

line:
    ENTER
    | expr ENTER { printf("Result :%d\n", $1); }
    ;

expr:
    NUMBER { $$ = $1; }
    | expr PLUS expr { $$ = $1 + $3; }
    | expr MINUS expr { $$ = $1 - $3; }
    ;

%%

void yyerror(const char *s){
    fprintf(stderr, "Error:%s\n", s);
}

int yylex() {
    int c = getchar();

    if (isdigit(c)) {
        yylval = c - '0';
        return NUMBER;
    }

    if (c == '+') return PLUS;
    if (c == '-') return MINUS;
    if (c == '\n') return ENTER;

    return c;
}

int main(){
    printf("enter a math exp:(eg:5+3):\n");
    yyparse();
    return 0;
}