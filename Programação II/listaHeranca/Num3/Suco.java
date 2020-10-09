package exercicios.listaHeranca.Num3;

public class Suco extends Bebida {    
    private String fruta;

    public Suco(String marca, String nome, String fruta){
        super(marca, nome);
        setfruta(fruta);
    }

    public void setfruta(String fruta){
        this.fruta = fruta;
    }

    public String getfruta(){
        return this.fruta;
    }
}   
