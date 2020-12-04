package exercicios.atividade1_ProgramacaoGenerica.Num1;

import java.util.ArrayList;

public class Pilha <T>{
    ArrayList<T> elementos;
    
    public Pilha(){
        elementos = new ArrayList<T>(10);
    }
    
    public void empilhar(T s){
        elementos.add(s);
    }
    
    public T desempilhar(){
        if (elementos.isEmpty()){
            return null;
        }
        T aux = elementos.get(elementos.size()-1);
        elementos.remove(elementos.size()-1);
        return aux;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T s : elementos){
            sb.append(s);
            sb.append(" | ");
        }
        return sb.toString();
    }  
}
