package exercicios.listaExercicios1.Num14;

public class No {
    String nomeProduto;
    Double valor;
    int quantidade;

    public No(String nome, Double valor, int quant){
        this.nomeProduto = nome;
        this.valor = valor;
        this.quantidade = quant;
    }

    @Override
    public String toString(){
        return "Nome: "+nomeProduto+" |valor: "+valor+" |quant: "+quantidade;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }
}
