package exercicios.listaExercicios3;

import java.util.Scanner;
import java.util.Random;

public class Num3 {
    static Scanner tec = new Scanner(System.in);

    static public int sumPair(int vet[], int n){
        if(n == 0){
            return 0;
        }else {
            if(vet[n] % 2 != 0){
                return sumPair(vet, n-1);
            }else{
                //System.out.println(vet[n]);
                return vet[n]+sumPair(vet, n-1);
            }
        }
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int vet[] = new int[13];

        for(int i = 0; i < vet.length; i++){
            vet[i] = random.nextInt(100);
            System.out.print(vet[i]+" | ");
        }
        System.out.println();

        //System.out.println(vet.length);

        int sumResult = Num3.sumPair(vet, (vet.length-1));

        System.out.print("Sun results: ");
        System.out.println(sumResult);
    }
}
