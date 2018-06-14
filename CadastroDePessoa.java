
package exerciciosprog2;
import java.util.Scanner;

class Pessoa{
    public String nome;
    public float altura;
    public float peso;
}

public class CadastroDePessoa {

    public static void main(String[] args) {

        Scanner t=new Scanner(System.in);
        Pessoa ser[]=new Pessoa[2];
        ser[0]=new Pessoa();
        ser[1]=new Pessoa();
        for (int f=0;f<ser.length;f++){
            System.out.println("Digite o nome da "+(f+1)+" pessoa: ");
            ser[f].nome=t.nextLine();
            System.out.println("Digite o peso do(a) "+ser[f].nome);
            ser[f].peso=t.nextFloat();
            System.out.println("Digite o altura do(a) "+ser[f].nome);
            ser[f].altura=t.nextFloat();
            t.nextLine();
        }
        if(ser[0].altura>=ser[1].altura){
            System.out.println("O "+ser[0].nome+" e mais alto");
        } else {
            System.out.println("O "+ser[1].nome+" e mais alto");
        }
        if(ser[0].peso>=ser[1].peso){
            System.out.println("O "+ser[0].nome+" e mais pesado");
        } else {
            System.out.println("O "+ser[1].nome+" e mais pesado");
        }
    }
    
}
