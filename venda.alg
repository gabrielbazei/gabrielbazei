algoritmo "lojinha"
var
continua,c1: caractere
c,aux,totcompras:inteiro
total: real
nome: vetor[1..100] de caractere
qtd1: vetor[1..100]de inteiro
funcao venda(tota:real;compra: caractere):real
var
qtd: inteiro
inicio
//seção de compras
tota <- 0
limpatela
escolha compra
caso "refri", "1", "refrigerante"
   escreval ("Quanto(s) refrigerante(s) você deseja?")
   leia (qtd)
   tota <- qtd * 2.50
   nome[totcompras] <- "Refrigerante(s)"
   qtd1[totcompras] <- qtd
   retorne tota
caso "2" , "salgadinho"
   escreval ("Quanto(s) salgadinho(s) você deseja?")
   leia (qtd)
   tota <- qtd * 2.50
   nome[totcompras] <- "salgadinho(s)"
   qtd1[totcompras] <- qtd
   retorne tota
caso "3" , "sanduiche"
   escreval ("Quanto(s) sanduiche(s) você deseja?")
   leia (qtd)
   tota <- qtd * 1.50
   nome[totcompras] <- "sanduiche(s)"
   qtd1[totcompras] <- qtd
   retorne tota
outrocaso
   escreval ("informe um valor valido")
   retorne tota
fimescolha
fimfuncao
inicio
//corpo
totcompras <- 1
escreval ("bem vindo a lojinha")
escreval ("Atenção é possivel somente executar 100 compras")
escreval
continua <- "sim"
enquanto (continua = "sim") ou (continua = "s") faca
   escreval ("Você esta na sua :",totcompras,"° compra")
   escreval ("escolha um dos itens:")
   escreval ("1: Refrigerante R$ 2,50")
   escreval ("2: Salgadinho R$ 2,50")
   escreval ("3: Sanduiche de queijo e mortadela R$ 1,50")
   leia (c1)
   total <- total + venda(total,c1)
   limpatela
   escreval ("deseja comprar mais alguma coisa?")
   leia (continua)
   se (continua = "s") ou (continua = "sim") entao
      totcompras <- totcompras +1
      limpatela
   fimse
fimenquanto
limpatela
//corrige as variveis repitdas
se totcompras > 2 entao
   para c de 1 ate totcompras faca
      para aux de c+1 ate totcompras faca
         se nome[c] = nome[aux] entao
            qtd1[c] <- qtd1[c] + qtd1[aux]
            qtd1[aux] <- 0
            nome[aux] <- "0"
         fimse
      fimpara
   fimpara
fimse
//escreve na tela somente as variaveis que nao forem 0 ou nulas
para c de 1 ate totcompras faca
   se (nome[c] <> "") e (nome[c] <> "0") e (qtd1[c] <> 0) entao
      escreva (qtd1[c]," ")
      escreval (nome[c])
   fimse
   escreval
fimpara
escreval ("total = R$ ", total)
fimalgoritmo
