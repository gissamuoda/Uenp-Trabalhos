package exercicios.listaExercicios1.Num14;

import java.util.Scanner;

public class Main {
    static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Tamanho da lista: ");
        int tam = tec.nextInt();
        
        ListaCompras l = new ListaCompras(tam);

        int op = 0;
        do {
            System.out.println("_________Menu_________");
            System.out.println("|  1 - Inserir dados  |");
            System.out.println("|  2 - Limpar lista   |");
            System.out.println("|  3 - Buscar dado    |");
            System.out.println("|  4 - Remove dado    |");
            System.out.println("|  5 - Imprimir lista |");
            System.out.println("| -1 - Sair           |");
            System.out.println("----------------------");
            System.out.print("opcao: ");
            op = tec.nextInt();
            tec.nextLine();

            switch (op) {
                case 1:
                    System.out.println("_______inserindo dados...______");
                    System.out.print("Nome do Produto: ");
                    String nome = tec.nextLine();
                    System.out.print("Valor: ");
                    Double valor = tec.nextDouble();
                    System.out.print("Quantidade: ");
                    int quant = tec.nextInt();

                    No aux = new No(nome, valor, quant);
                    l.insere(aux);

                    break;
                
                case 2:
                    System.out.println("_______limpando lista...______");

                    l.limpaLista();

                    break;

                case 3:
                    System.out.println("_______buscando dado...______");
                    System.out.print("Nome a ser buscado: ");
                    String nBusca = tec.nextLine();

                    No buscado = l.busca(nBusca);

                    if(buscado != null){
                        System.out.println("Resultado da busca: ");
                        System.out.println(buscado.toString());
                    }else{
                        System.out.println("Nao foi possivel encontrar");
                    }

                    break;

                case 4:
                    System.out.println("_______removendo dado...______");
                    System.out.print("Nome a ser deletado: ");
                    String nDelete = tec.nextLine();

                    l.remove(nDelete);

                    break;

                case 5: 
                    System.out.println("_______imprimindo lista...______");
                    l.imprimeLista();

                    break;

            }

        } while (op != -1);

    }
}
