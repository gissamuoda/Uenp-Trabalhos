package exercicios.listaExercicios2.Num2;

public class Lista {
    Atleta inicio;
    Atleta fim;

    public void insert(Atleta n){
        if(inicio == null){
            this.inicio = n;
            this.fim = n;
        }else {
            fim.proximo = n;
            fim = n;
        }
    }

    public Atleta buscaAnterior(String s){
        Atleta ant = inicio;
        while(ant.proximo != null){
            if(ant.proximo.nome.contains(s)){
                return ant;
            }else {
                ant = ant.proximo;
            }
        }
        return null;
    }
    
    public Atleta delete(String s){
        Atleta aux = inicio;
        if(inicio != null){
            if(aux.nome.contains(s)){
                if(inicio == fim){
                    fim = null;
                    inicio = null;
                }else {
                    inicio = aux.proximo;
                    aux.proximo = null;
                }
            }else {
                Atleta ant = buscaAnterior(s);
                if (ant != null){
                    aux = ant.proximo;
                    if(aux == fim){
                        ant.proximo = null;
                        fim = ant;
                    }else {
                        ant.proximo = aux.proximo;
                        aux.proximo = null;
                    }
                }else {
                    System.out.println("Nome não encontrado na lista!");
                    return null;
                }

            }
            System.out.println("...Removido => "+s);
            return aux;
        }else {
            System.out.println("Lista vazia");
            return null;
        }
    }

    public Atleta busca(String s){
        Atleta aux = inicio;
        while (aux != null){
            if(aux.nome.contains(s)){
                return aux;
            }else {
                aux = aux.proximo;
            }
        }
        return null;
    }

    public void printList(){
        Atleta aux = inicio;
        if (inicio == null){
            System.out.println("---> Lista vazia <---");
        }else {
            System.out.println("------> Lista <------");
            while(aux != null){
                System.out.println(aux.toString());
                aux = aux.proximo;
            }
        }
    }
}
