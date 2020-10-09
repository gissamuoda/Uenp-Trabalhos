package exercicios.listaHeranca.Num4;

public class Retangulo extends Figura {
    Double dim1; 
    Double dim2;
    
    public Retangulo(){
        dim1 = 0.0;
        dim2 = 0.0;
    }

    public Retangulo(Double dim1, Double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public Double calcularArea(){
        return (this.dim1*this.dim2);
    }
}
