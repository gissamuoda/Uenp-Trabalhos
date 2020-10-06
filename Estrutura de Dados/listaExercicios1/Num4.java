package exercicios.listaExercicios1;

import java.util.Scanner;

public class Num4 {
    static Scanner sc = new Scanner(System.in);
    static final int TAM = 20;
    public static void main(String[] args) {
        int vet[] = new int[TAM];
        
        for(int i = 0; i < TAM; i++){
            System.out.print("numero posição "+i+" : ");
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < TAM; i++){
            System.out.print(vet[i] + " | ");
        }
        
        System.out.println();

        int aux[] = new int[TAM];
        for(int i = vet.length-1, j = 0; i >= 0; i--, j++){
            aux[j] = vet[i];
        } 

        System.out.println();
        for(int i = 0; i < TAM; i++){
            System.out.print(aux[i] + " | ");
        }
    }
}
