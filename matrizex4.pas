program vet1;
uses crt;
var g:array[1..5,1..5] of integer;
    f,f1,m:integer;
begin
    m:=0;
    writeln ('Digite a matriz: ');
    for f:= 1 to 5 do
        for f1:=1 to 5 do
            begin
                 write ('digite um valor para a ',f,' linha e ',f1,' coluna: ');
                 readln (g[f,f1]);
            end
            ;
    ;
    for f:= 1 to 5 do
        for f1:=1 to 5 do
            if g[f,f1] >m then
               m:=g[f,f1];
            ;
        ;
    ;
    for f:= 1 to 5 do
        for f1:=1 to 5 do
            g[f,f1]:= g[f,f1]*m;
            ;
    ;
    writeln ('Matriz modificada: ');
    for f:=1 to 5 do
        begin
        writeln ();
                for f1:= 1 to 5 do
                    write (g[f,f1],' ');
                    ;
        end
        ;
   readln;
end.
