package exercicios.listaExercicios2.Num2;

public class Atleta{
    String nome; 
    float altura; 
    float peso;
    String esporte; 
    String patrocinadores; 

    Atleta proximo;

    public Atleta(String nome, float altura, float peso, String esporte, String patrocinadores){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.esporte = esporte;
        this.patrocinadores = patrocinadores;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" |Altura: "+altura+" |Peso: "+peso+" |Esporte: "+esporte+" |Patrocinadores: "+patrocinadores;
    }
}