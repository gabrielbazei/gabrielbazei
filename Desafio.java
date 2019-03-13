import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
	File arquivo = new File("teste.txt");
	FileReader leitor = null;
	try {
		leitor = new FileReader(arquivo);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	BufferedReader br = new BufferedReader(leitor);
	
	
	String[] vetorLinhas = new String[30];
	
	
	int tamanhoVetorArquivo = 0;
	try {
		while (( vetorLinhas[tamanhoVetorArquivo] = br.readLine()) != null) {
			tamanhoVetorArquivo++;
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
        
        // Codigo acima serve para gerenciar o documento de texto onde deve ser escito as palavras
	int numAleatorio = gerador.nextInt(tamanhoVetorArquivo); // gerador de numero aleatorio
        String palavra = vetorLinhas[numAleatorio];
        String letra="A";
        String forca =palavra;
        for(int f=0;f<palavra.length();f++){
            if(palavra.charAt(f)==forca.charAt(f)){
                char trocadorLetra[] = forca.toCharArray();
                trocadorLetra[f] = '-';
                forca= new String(trocadorLetra);
            }
        }
        String letrasErradas="";
        int testarPalavra=0;
        int tentativas = 5;
        int trancaif=0;
        String jogarNovamente = "s";
        // inicialização das variavveis
        while(jogarNovamente.equals("s")){
            try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
            } catch (AWTException ex) {
            }
            //cogigo robot serve para limpar a tela
            if (tentativas<=0){
                try {
                Robot robot = new Robot();
                robot.setAutoDelay(10);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_L);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_L);
                } catch (AWTException ex) {
                }
                System.out.println("_____________");
                System.out.println("|           |");
                System.out.println("|           O");
                System.out.println("|          `|´");
                System.out.println("|          ´ `");
                System.out.println("|        forca");
                System.out.println("|            ");
                System.out.println("Voce Perdeu! Deseja jogar novamente? s/n");
                jogarNovamente = teclado.nextLine();
                //Mostra a forca completa caso que o jogador tenha perido
                if (jogarNovamente.equals("s")){
                    numAleatorio = gerador.nextInt(tamanhoVetorArquivo);
                    palavra = vetorLinhas[numAleatorio];
                    letra="A";
                    forca =palavra;
                    for(int f=0;f<palavra.length();f++){
                        if(palavra.charAt(f)==forca.charAt(f)){
                            char trocadorLetra[] = forca.toCharArray();
                            trocadorLetra[f] = '-';
                            forca= new String(trocadorLetra);
                        }
                    }
                    letrasErradas="";
                    testarPalavra=0;
                    tentativas = 5;
                    // reseta  as variaveis antes do jogador poder jogar novamente
                    continue;
                }else{
                    break;
                }
            }
            if (forca.equals(palavra)){
                try {
                Robot robot = new Robot();
                robot.setAutoDelay(10);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_L);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_L);
                } catch (AWTException ex) {
                }
                System.out.println("Parabens!! você ganhou");
                break;
            }
            System.out.println(numAleatorio);
            System.out.println("Numero de tentativas restantes: "+tentativas);
            System.out.println("Letras não presentes na palavra: "+letrasErradas);
            System.out.println(forca);
            System.out.println("_____________");
            if(tentativas<=4){
                System.out.println("|           |");
            }else{
                System.out.println("|            ");
            }
            if(tentativas<=3){
                System.out.println("|           O");
            }else{
                System.out.println("|            ");
            }
            if(tentativas<=2){
                System.out.println("|          `|´");
            }else{
                System.out.println("|            ");
            }
            if(tentativas<=1){
                System.out.println("|          ´ `");
            }else{
                System.out.println("|            ");
            }
            if(tentativas<=0){
                System.out.println("|        forca");
            }else{
                System.out.println("|            ");
            }
            System.out.println("|            ");
            System.out.println("");
            System.out.println("");
            //System.out.println("palavra: "+palavra); Cheat caso o desenvolvedor esteja com problemas com as palavras
            System.out.println("Digite uma letra: ");
            letra=teclado.nextLine();
            trancaif=0;
            for (int f=0;f<palavra.length();f++){
                if(palavra.charAt(f)==letra.charAt(0)){
                trancaif=+1;
                }
            }
            System.out.println(trancaif);
            if (trancaif>=1){
                for(int f=0;f<palavra.length();f++){
                    if(palavra.charAt(f)==letra.charAt(0)){
                        System.out.println("entrou no if");
                        char trocadorLetra[] = forca.toCharArray();
                        trocadorLetra[f] = letra.charAt(0);
                        forca= new String(trocadorLetra);
                    }
                }
            } else {
                System.out.println("entrou no else");
                tentativas=tentativas - 1;
                letrasErradas+=(" - "+letra.charAt(0));
            }
        }
    }
}
