package exercicios.listaExercicios3;

import java.util.Scanner;
import java.util.Random;

public class Num3 {
    static Scanner tec = new Scanner(System.in);

    static public int sumPair(int vet[], int n, int debug){
        if(n == 0){
            return 0;
        }else {
            if(vet[n] % 2 != 0){
                return sumPair(vet, n-1, debug);
            }else{
                if (debug == 1){
                    System.out.print(vet[n]+" | ");    
                }
                return vet[n]+sumPair(vet, n-1, debug);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Debug? (1 - yes / 0 - no ): ");
        int debug = tec.nextInt();

        Random random = new Random();
        int vet[] = new int[100];
        int sumResult;

        for(int i = 0; i < vet.length; i++){
            vet[i] = random.nextInt(100);
        }

        if (debug == 1){
            System.out.println("Generated vector: ");
            for(int i = 0; i < vet.length; i++){
                System.out.print(vet[i]+" | ");
            }
            System.out.println();
            System.out.println("Added numbers: ");
        }

        sumResult = Num3.sumPair(vet, (vet.length-1), debug);

        System.out.println();
        System.out.print("Sun results: ");
        System.out.println(sumResult);
    }
}
