package exercicios.listaHeranca.Num3;

public class Main {
    public static void main(String[] args) {
        Bebida bebida = new Bebida("Skol", "Beats");
        System.out.println(bebida.toString());

        BebidaAlcoolica bAlcool = new BebidaAlcoolica("Heineken", "Ceveja", 5.0);
        System.out.println(bAlcool.toString()+" |Teor: "+bAlcool.getTeor()+"%");

        Refrigerante refri = new Refrigerante("Coca-cola", "Fanta", "uva");
        System.out.println(refri.toString()+" |Sabor: "+refri.getSabor());

        Suco suco = new Suco("nosliw", "nosliw", "laranja");
        System.out.println(suco.toString()+" |Fruta: "+suco.getfruta());

    }
}
