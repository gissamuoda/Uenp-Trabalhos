package exercicios.listaExercicios2.Num3.Pilha;

public class Pilha {
    No topo; 

    public void push(No n){
        if(topo == null){
            topo = n;
        }else {
            No aux = topo;
            topo.proximo = n;
            topo = n;
            topo.anterior = aux;
        }
    }

    public No Pop(){
        if(topo != null){
            No aux = topo; 
            topo = aux.anterior;
            topo.proximo = null;
            return aux;
        }else {
            System.out.println("Pilha vazia...");
            return null;
        }
    }

    public void printPilha(){
        No aux = topo;
        if (topo == null){
            System.out.println("----> Empty list <----");
        }else {
            System.out.println("Topo da Lista: "+ topo.getClass()+"@"+Integer.toHexString(topo.hashCode()));
            while(aux != null){
                System.out.println(aux.toString());
                aux = aux.anterior;
            }
        }
    }
}
