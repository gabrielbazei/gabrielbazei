program ex04;
uses crt;
type aluno = record
           nome: String [30];
           disc:String[10];
           nota:Integer;
           end;
turma = array[1..30] of aluno;
var
alu:turma;
c,f,t: integer;
s:string;
begin
c:=1;
s:='s';
while (s = 's') and (c<=30) do
      begin
      write ('Digite o nome do ',c,' aluno: ');
      readln (alu[c].nome);
      write ('Digite a Disciplina do(a) ',alu[c].nome,': ');
      readln (alu[c].disc);
      write ('Digite a nota do(a) ',alu[c].nome,' na disciplina ',alu[c].disc,': ');
      readln (alu[c].nota);
      c:=c+1;
      write ('Deseja cadastrar outro aluno? (s/n)');
      readln (s);
      writeln ('---------------------------------------------------------------------');
      end;
clrscr;
c:=c-1;
s:='s';
t:=0;
while s <> 'fim' do
      begin
      write ('Digite o nome do aluno que deseja consultar (fim para parar a consulta): ');
      readln(s);
      if s='fim' then
         continue;
      for f:=1 to 30 do
          if s=alu[f].nome then
             t:=f;
      ;
      if t=0 then
         begin
         writeln ('Nao foi localizado aluno com este nome ');
         continue
         end;
      writeln ('O codigo do aluno e ',t,' a disciplina e: ',alu[t].disc,' E sua nota e ',alu[t].nota);
      end;
readln;
end.
