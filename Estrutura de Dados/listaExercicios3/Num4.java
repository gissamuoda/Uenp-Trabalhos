package exercicios.listaExercicios3;

import java.util.Random;
import java.util.Scanner;

public class Num4 {
    static Scanner tec = new Scanner(System.in);
    static Random rand = new Random();

    static public long searchPassword(long password, long attempts){
        if (attempts == password){
            return attempts;
        }else {
            return searchPassword(password, (attempts+1));
        }
    }

    public static void main(String[] args) {
        System.out.print("Random password? (y - yes/ n - no): ");
        String testCase = tec.nextLine(); 

        long password = 0;  
        long attempts = 0;

        switch (testCase) {
            case "y":
                password = rand.nextInt(10000); 
            break;

            case "n":
                System.out.print("Password: ");
                password = tec.nextInt();
            break;
        }
        
        long result = Num4.searchPassword(password, attempts);

        System.out.println("Senha: "+password+" | Senha encontrada: "+result);
    }
}
