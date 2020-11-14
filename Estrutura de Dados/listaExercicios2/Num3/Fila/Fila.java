package exercicios.listaExercicios2.Num3.Fila;

public class Fila {
    No inicio;
    No fim;

    public void insert(No n){
        if(inicio == null){
            this.inicio = n;
            this.fim = n;
        }else{
            fim.proximo = n;
            n.anterior = fim;
            fim = n;
        }
    }

    public No remove(){
        if(inicio != null){
            No temp = inicio;
            inicio = temp.proximo;
            if(inicio == fim){
                inicio.proximo = null;
                fim = inicio;
            }
            inicio.anterior = null;
            return temp;
        }else {
            System.out.println("Lista fazia!");
            return null;
        }
    }

    public void printFila(){
        No aux = inicio;
        if (inicio == null){
            System.out.println("----> Empty list <----");
        }else {
            System.out.println("Inicio da Lista: "+ inicio.getClass()+"@"+Integer.toHexString(inicio.hashCode()));
            System.out.println("Final da Lista: "+ fim.getClass()+"@"+Integer.toHexString(fim.hashCode()));
            while(aux != null){
                System.out.println(aux.toString());
                aux = aux.proximo;
            }
        }
    }
}