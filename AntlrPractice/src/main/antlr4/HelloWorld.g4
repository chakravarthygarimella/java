grammar HelloWorld;

parser_rule:
    (HELLO WHITESPACES+ ID)
;

ID:
    [0-9]
;

HELLO:
    'Hello'
;

WHITESPACES:
 ' '
;