package exercicios.listaExercicios1.Num8;

public class Lista {
    int TAM = 0;
    Conta lista[];
    int ultimo = -1;

    public Lista(int tam){
        lista = new Conta[tam];
        TAM = tam;
    }

    public void cadastra(Conta n){
        if(ultimo < TAM){
            ultimo++;
            lista[ultimo] = n;
        } else {
            System.out.println("Lista cheia");
        }
    }
    
    public int buscaConta(String nome){
        for(int i = 0; i < TAM; i++){
            if(lista[i].getNome().contains(nome)){
                return i;
            }
        }
        return -1;
    }

    public void depositar(Double valor, int posi){
        double saldo = lista[posi].getSaldo() + valor;
        lista[posi].setSado(saldo);
    }

    public void retirar(Double valor, int posi){
        double saldo = lista[posi].getSaldo() - valor;
        lista[posi].setSado(saldo);
    }

    public void imprime(){
        for(int i = 0; i < TAM; i++){
            System.out.println(lista[i].toString());
        }
    }
}
