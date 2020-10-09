package exercicios.listaHeranca.Num3;

public class BebidaAlcoolica extends Bebida {
    private Double teorAlcool;

    public BebidaAlcoolica(String marca, String nome, Double teorAlcool){
        super(marca, nome);
        this.setTeor(teorAlcool);
    }
    
    public void setTeor(Double teorAlc){
        this.teorAlcool = teorAlc;
    }

    public Double getTeor(){
        return teorAlcool;
    }
}
