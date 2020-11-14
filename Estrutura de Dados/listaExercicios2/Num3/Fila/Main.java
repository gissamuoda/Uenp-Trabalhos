package exercicios.listaExercicios2.Num3.Fila;

public class Main {
    public static void main(String[] args) {
        Fila fl = new Fila();

        for(int i = 0; i < 5; i++){
            No n = new No("bazinga",i);
            fl.insert(n);
        }
        System.out.println("------> Lista: ");
        fl.printFila();

        System.out.println();
        System.out.println("------> Revomed element");
        System.out.println(fl.remove());

        System.out.println();
        System.out.println("------> Lista depois da remoção");
        fl.printFila();
    }
}
