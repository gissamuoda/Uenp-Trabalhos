package exercicios.listaExercicios1.Num14;

public abstract class ListaEstatica {
    public int prim;
    public int ultimo;

    abstract public void insere(No n);
    abstract public void limpaLista();
    abstract public No busca(String s);
    abstract public void remove(String r);
    abstract public void imprimeLista();
}
