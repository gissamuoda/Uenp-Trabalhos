package exercicios.listaHeranca.Num3;

public class Refrigerante extends Bebida {    
    private String sabor;

    public Refrigerante(String marca, String nome, String sabor){
        super(marca, nome);
        setSabor(sabor);
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getSabor(){
        return this.sabor;
    }
}   
