package exercicios.listaExercicios3;

import java.util.Scanner;

public class Num2 {
    static Scanner tec = new Scanner(System.in); 

    static public int raisePower(int num, int pot){
        if (pot == 0){
            return 1; 
        }else {
            return num * raisePower(num, pot-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Num: ");
        int num = tec.nextInt();
        System.out.print("Pot: ");
        int pot = tec.nextInt();
        System.out.println(Num2.raisePower(num, pot));
    }
}
