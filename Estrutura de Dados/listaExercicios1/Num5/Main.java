package exercicios.listaExercicios1.Num5;

import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int TAM = 13;
    public static void main(String[] args) {
        int G[] = new int[TAM];
        int numApostador;

        System.out.println("----Gabarito----");
        for(int i = 0; i < G.length; i++){
            G[i] = sc.nextInt();
        }
        System.out.println();
        
        System.out.println("Numero de apostadores: ");
        numApostador = sc.nextInt();

        Aposta resp[] = new Aposta[numApostador];
        int num[][] = new int[TAM][TAM];

        for(int i = 0; i < numApostador; i++){
            System.out.print("Numero do cartao: ");
            int card = sc.nextInt();
            for(int j = 0; j < TAM; j++){
                System.out.print(j+": ");
                num[i][j] = sc.nextInt();
            }
            resp[i] = new Aposta(card, num[i]);
        }

        System.out.println();
        for(int i = 0; i < numApostador; i++){
            int acert = 0;
            for(int j = 0; j < TAM; j++){
                if(G[j] == resp[i].R[j]){
                    acert++;
                }
            }
            System.out.println("Cartão: "+resp[i].numCard+" acertos: "+acert);
            if(acert == TAM){
                System.out.println("Ganhador, parabéns!");
            }
        } 
    }
}
