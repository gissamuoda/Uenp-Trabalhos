package exercicios.listaExercicios2.Num3.Fila;

public class No {
    String valor; 
    int id;

    No proximo;
    No anterior;

    public No(String v, int i){
        valor = v;
        id = i;
    }

    @Override
    public String toString(){
        if(proximo == null && anterior == null){
            return this.getClass()+"@"+Integer.toHexString(this.hashCode())+" => No - id: "+id+" |valor: "+valor+" |previous element: null"+" |next element: null";
        }else if(proximo != null && anterior == null){
            return this.getClass()+"@"+Integer.toHexString(this.hashCode())+" => No - id: "+id+" |valor: "+valor+" |previous element: null"+" |next element: "+proximo.getClass()+"@"+Integer.toHexString(proximo.hashCode());
        }else if(proximo == null && anterior != null){
            return this.getClass()+"@"+Integer.toHexString(this.hashCode())+" => No - id: "+id+" |valor: "+valor+" |previous element: "+anterior.getClass()+"@"+Integer.toHexString(anterior.hashCode())+" |next element: null";
        }else {
            return this.getClass()+"@"+Integer.toHexString(this.hashCode())+" => No - id: "+id+" |valor: "+valor+" |previous element: "+anterior.getClass()+"@"+Integer.toHexString(anterior.hashCode())+" |next element: "+proximo.getClass()+"@"+Integer.toHexString(proximo.hashCode());
        }
    }
}
