package exercicios.listaHeranca.Num4;

public class Triangulo extends Figura{
    Double base;
    Double altura;

    public Triangulo(){
        base = 0.0;
        altura = 0.0;
    }

    public Triangulo(Double base, Double altura){
        this.base = base; 
        this.altura = altura;
    }

    public Double calcularArea(){
        return ((this.base*this.altura)/2);
    }
}
