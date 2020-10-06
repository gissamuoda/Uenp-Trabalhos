package exercicios.listaExercicios1.Num8;

public class Conta {
    String nomeTitular; 
    int numeroConta;
    int numeroAgencia; 
    Double saldoConta;

    public Conta(String nome, int nC, int nA, Double saldo){
        this.nomeTitular = nome;
        this.numeroConta = nC; 
        this.numeroAgencia = nA;
        this.saldoConta = saldo;
    }

    public String getNome(){
        return nomeTitular;
    }

    public Double getSaldo(){
        return saldoConta;
    }

    public void setSado(Double saldo){
        this.saldoConta = saldo;
    }

    public String toString(){
        return "Nome: "+nomeTitular+" |Conta: "+numeroConta+" |Agencia: "+numeroAgencia+" |Saldo: "+saldoConta;
    }
}
