package exercicios.listaHeranca2.Num3;

public class FolhaPagamento {
   public static void main(String[] args) {
       int tam = 4;
       Funcionario lista[] = new Funcionario[tam];

       lista[0] = new Diarista(120.00, 5);
       lista[1] = new Diarista(100.00, 10);
       lista[2] = new Diarista(140.00, 4);
       lista[3] = new Gerente(3_000.00); 

       for(int i = 0; i < tam; i++){
           System.out.println("lista["+i+"]: salario = "+lista[i].calcularSalario());
       }
    }
}
