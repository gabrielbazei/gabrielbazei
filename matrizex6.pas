program vet1;
uses crt;
var g:array[1..8,1..8] of integer;
    f,f1,t:integer;
begin
    t:=0;
    writeln ('Digite a matriz: ');
    for f:= 1 to 8 do
        for f1:=1 to 8 do
            begin
                 write ('digite um valor para a ',f,' linha e ',f1,' coluna: ');
                 readln (g[f,f1]);
            end
            ;
    ;
    for f:=1 to 8 do
        for f1:=1 to 8 do
            if g[f,f1]=g[f1,f] then
               t:=t+1;
        ;
    ;
    writeln ('Matriz: ');
    for f:=1 to 8 do
        begin
        writeln ();
                for f1:= 1 to 8 do
                    write (g[f,f1],' ');
                    ;
        end
        ;
   writeln;
   if t=64 then
      writeln ('Matriz simetrica')
   else
      writeln ('Matriz não simetrica')
   ;
   readln;
end.
