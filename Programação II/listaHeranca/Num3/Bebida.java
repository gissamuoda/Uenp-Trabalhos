package exercicios.listaHeranca.Num3;

public class Bebida {
    private String marca;
    private String nome;

    public Bebida(){
        marca = "";
        nome = "";
    }

    public Bebida(String marca, String nome){
        setMarca(marca);
        setNome(nome);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return "Marca: "+marca+" |Nome: "+nome;
    }
}
