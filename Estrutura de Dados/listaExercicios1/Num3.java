package exercicios.listaExercicios1;

import java.util.Scanner;

public class Num3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("tamanho do vetor: ");
        int tam = sc.nextInt();

        int vet[] = new int[tam];

        for(int i = 0; i < vet.length; i++){
            System.out.println("digite o valor na posicao "+i);
            vet[i] = sc.nextInt();
        }

        int vet2[] = new int[tam];
        for(int i = 0; i < vet.length; i++){
            vet2[i] = vet[i];
        }

        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i]+ " | ");
        }

        System.out.println("\nCopia: ");
        for(int i = 0; i < vet2.length; i++){
            System.out.print(vet2[i]+ " | ");
        }
    }
}
