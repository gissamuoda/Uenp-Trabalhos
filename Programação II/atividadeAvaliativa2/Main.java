package exercicios.atividadeAvaliativa2;

public class Main {
    public static void main(String[] args) {
        Caixa box = new Caixa(10);

        System.out.println(box.getFlag());

        Caixa.zerar(box);

        System.out.println(box.getFlag());
    }
}
