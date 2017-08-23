program teste;
uses crt;
var
palavra,test,maior,copia:string;
n,cc:integer;
begin
Write ('Digite uma frase:');
readln(palavra);
n:=length(palavra);
while palavra[1]=' ' do
begin
test:= copy(palavra, 2, n);
palavra:=test;
end;
palavra:=palavra+'  ';
writeln ('.',palavra,'.');
maior:='';
while palavra[1]<>' ' do
begin
     writeln('testando');
     cc:=1;
     while palavra[cc] <> ' ' do
           cc:=cc+1;
     test:=copy(palavra,1,cc-1);
     if length(test) > length(maior) then
        maior:=test;
     copia:=copy(palavra,cc+1,n);
     palavra:=copia;
end;
writeln ('fim dos testes');
write ('A maior palavra da frase é:');
write (maior);
readln;
end.
