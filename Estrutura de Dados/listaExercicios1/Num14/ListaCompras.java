package exercicios.listaExercicios1.Num14;

public class ListaCompras extends ListaEstatica{
    No lista[];
    int tam;
    int prim = -1;
    int ultimo = -1;

    public ListaCompras(int tam){
        lista = new No[tam];
        this.tam = tam;
    }

    public void insere(No n){
        if(prim == -1){
            prim = 0; 
            ultimo = 0;
            lista[ultimo] = n;
        }else if(ultimo < tam-1){
            ultimo++;
            lista[ultimo] = n;
        }else{
            System.out.println("Lista cheia");
        }
    }

    public void limpaLista(){
        for(int i = 0; i <tam; i++){
            lista[i] = null;
        }
        prim = -1; 
        ultimo = -1;
    }

    public No busca(String s) {
        for(int i = 0; i< tam; i++){
            if(lista[i].getNomeProduto().contains(s)){
                return lista[i];
            }
        }
        return null;
    }

    public int buscaRemover(String s) {
        for(int i = 0; i< tam; i++){
            if(lista[i].getNomeProduto().contains(s)){
                return i;
            }
        }
        return -1;
    }

    public void remove(String r){
        int rem = this.buscaRemover(r);
        if(rem != -1){
            No remover = lista[rem];
            for(int i = rem; i<ultimo; i++){
                lista[i] = lista[i+1];
            }
            lista[ultimo] = null;
            ultimo = ultimo -1;
            System.out.println("Removido com sucesso: "+remover.toString());
        }else{
            System.out.println("Lista vazia");
        }
    }

    public void imprimeLista(){
        if(prim != -1 && ultimo != -1){
            for(int i = prim; i < ultimo+1; i++){
                System.out.println(lista[i].toString());
            }
        }else{
            System.out.println("Lista vazia!");
        }

    }
}
