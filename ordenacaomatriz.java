/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaodematrizes;

import java.util.Scanner;

/**
 *
 * @author bazei
 */
public class OrdenacaoDeMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n[][]=new int[2][3];
        int v[]=new int[6];
        int aux;
        for (int c=0;c<2;c++){
            for (int c1=0;c1<3;c1++){
                System.out.print("Digite o valor para a "+(c+1)+"° linha e "+(c1+1)+"° coluna: ");
                n[c][c1]=t.nextInt();
            }
        }
        //ORDENANDO A MATRIZ PASSANDO PARA UM VETOR
        /*System.out.println("Passando para o vetor");
        int cc=0;
        for (int c=0;c<2;c++){
            for (int c1=0;c1<3;c1++){
                v[cc]=n[c][c1];
                cc++;
            }
        }

        for (int c=0;c<6;c++){
            for (int c1=0;c1<6;c1++){
                if (v[c]<v[c1]){
                    aux=v[c1];
                    v[c1]=v[c];
                    v[c]=aux;
                }
            }
        }
        cc=0;
        for (int c=0;c<2;c++){
            for (int c1=0;c1<3;c1++){
                n[c][c1]=v[cc];
                cc++;
            }
        }
        */
        
        //ORDENANDO UMA MATRIZ SEM PASSAR PARA UM VETOR
        //Ordena uma vez a linha
        for (int cc=0;cc<2;cc++){    
            for (int c=0;c<3;c++){
                for(int c1=0;c1<3;c1++){
                    if (n[cc][c]<n[cc][c1]){
                        aux=n[cc][c1];
                        n[cc][c1]=n[cc][c];
                        n[cc][c]=aux;
                    }  
                }
            }
        }
        //ordena uma vez a coluna
        for (int cc=0;cc<3;cc++){    
            for (int c=0;c<2;c++){
                for(int c1=0;c1<2;c1++){
                    if (n[c][cc]<n[c1][cc]){
                        aux=n[c1][cc];
                        n[c1][cc]=n[c][cc];
                        n[c][cc]=aux;
                    }  
                }
            }
        }
        // Ordena uma segunda vez a linha para checkagem
        for (int cc=0;cc<2;cc++){    
            for (int c=0;c<3;c++){
                for(int c1=0;c1<3;c1++){
                    if (n[cc][c]<n[cc][c1]){
                        aux=n[cc][c1];
                        n[cc][c1]=n[cc][c];
                        n[cc][c]=aux;
                    }  
                }
            }
        }
        for (int c=0;c<2;c++){
            System.out.println("");
            for (int c1=0;c1<3;c1++){
                System.out.print(n[c][c1]+" ");
            }
        }
        System.out.println("");
    }   
}
