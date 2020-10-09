package exercicios.listaHeranca;

import exercicios.listaHeranca.Num1.*;

public class Num2 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(2, 5);

        Circulo c1 = new Circulo(p1, 5);
        
        System.out.println(c1.toString());

        // para acessar os atributos dessa classe, pode ser usado os métodos get. 
        System.out.println("Raio: "+c1.getRaio());
        System.out.println("Coordenadas: "+c1.getPonto().toString());
    }
}
