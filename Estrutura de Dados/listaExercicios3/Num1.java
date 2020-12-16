package exercicios.listaExercicios3;

import java.util.Scanner;

public class Num1 {
    static Scanner tec = new Scanner(System.in);

    static public int sumPositiveIntegers(int n){
        if(n == 0){
            return 0; 
        }else {
            return sumPositiveIntegers(n - 1)+n;
        }
    }

    public static void main(String[] args) {
        System.out.print("Number to make the sum (integer only): ");
        int num = tec.nextInt();

        System.out.print("Sum Result: ");
        System.out.println(sumPositiveIntegers(num));
    }
}
