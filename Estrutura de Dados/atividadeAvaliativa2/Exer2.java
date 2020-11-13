package exercicios.atividadeAvaliativa2;

public class Exer2 {
    public static int mostrar(String... strings){
        int i;
        for(i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
        return i;
    }

    public static void main(String[] args) {
        int quant = Exer2.mostrar("Sheldon", "Leonard", "Howard", "Raj", "Penny");

        System.out.println("Numeros de strings: "+quant);
    }
}
