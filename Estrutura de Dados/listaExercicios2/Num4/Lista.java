package exercicios.listaExercicios2.Num4;

public class Lista {
    Aluno inicio;
    Aluno fim;

    public void insert(Aluno n){
        if (inicio == null){
            this.inicio = n;
            this.fim = n;
        }else {
            fim.proximo = n;
            n.anterior = fim;
            fim = n;
        }
    }

    public void printList(){
        Aluno aux = inicio;
        if (inicio == null){
            System.out.println("lista vazia!!");
        }else {
            System.out.println("---> Lista de Alunos <---");
            while(aux != null){
                System.out.println(aux.toString());
                aux = aux.proximo;
            }
        }
    }

}
