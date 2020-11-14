package exercicios.listaExercicios2.Num3.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha fl = new Pilha();

        for(int i = 0; i < 5; i++){
            No n = new No("bazinga",i);
            fl.push(n);
        }
        System.out.println("------> Lista: ");
        fl.printPilha();

        System.out.println();
        System.out.println("------> Revomed element");
        System.out.println(fl.Pop());

        System.out.println();
        System.out.println("------> Lista depois da remoção");
        fl.printPilha();
    }
}
