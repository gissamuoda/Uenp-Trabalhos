package exercicios.listaHeranca.Num4;

public class Main {
    public static void main(String[] args) {
        Figura ret = new Retangulo(10.0, 5.0);
        System.out.println(ret.calcularArea());

        Figura tri = new Triangulo(5.0, 6.0);
        System.out.println(tri.calcularArea());
    }
}
