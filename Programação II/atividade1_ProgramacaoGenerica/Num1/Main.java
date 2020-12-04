package exercicios.atividade1_ProgramacaoGenerica.Num1;
public class Main {
    public static void main(String[] args) {
        /* método criado para ser genérico: 
        Pilha<**> p = new Pilha <**>();

        ** = tipo de objeto (não pode ser tipos primitivos)
        */

        Pilha<Integer> p1 = new Pilha<Integer>();
        
        for(int i = 0; i < 10; i++){
            p1.empilhar(i*10);
        }

        System.out.println(p1.toString());


        Pilha<String> p = new Pilha<String>();
        
        for(int i = 0; i < 5; i++){
            p.empilhar("bazinga");
        }

        System.out.println(p.toString());

    }
}
