package exercicios.atividade2_ProgramacaoGenerica;

public class Num3 <T> {
    T esquerda; 
    T meio; 
    T direita; 

    public Num3(T esquerda, T meio, T direita){
        this.esquerda = esquerda;
        this.meio = meio; 
        this.direita = direita;
    }

    @Override
    public String toString(){
        return "Esquerda: "+esquerda+" | Meio: "+meio+" | Direita: "+direita;
    }

    public static void main(String[] args) {
        Num3<Integer> inteiros = new Num3<Integer>(5, 10, 15); 
        System.out.println(inteiros.toString());

        Num3<String> string = new Num3<String>("Leonard", "Sheldon", "Penny");
        System.out.println(string.toString());
    }
}
