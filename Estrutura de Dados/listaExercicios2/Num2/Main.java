package exercicios.listaExercicios2.Num2;

import java.util.Scanner;

public class Main {
    static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        Lista l = new Lista();

        do {
            System.out.println("---------------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Remover");
            System.out.println("3 - Buscar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = tec.nextInt();
            tec.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome:");
                    String nome = tec.nextLine();
                    System.out.print("Altura: ");
                    float alt = tec.nextFloat();
                    tec.nextLine();
                    System.out.print("Peso: ");
                    float peso = tec.nextFloat();
                    tec.nextLine();
                    System.out.print("Esport:");
                    String esp = tec.nextLine();
                    System.out.print("Patrocinador:");
                    String patr = tec.nextLine();

                    Atleta novo = new Atleta(nome, alt, peso, esp, patr);
                    l.insert(novo);
                    break;
                case 2: 
                    System.out.print("Quem deseja remover: ");
                    String remov = tec.nextLine();
                    l.delete(remov);
                    break;
                case 3: 
                    System.out.print("Quem deseja buscar: ");
                    String busc = tec.nextLine();
                    Atleta buscado = l.busca(busc);
                    if (buscado != null){
                        System.out.println(buscado.toString());
                    }else {
                        System.out.println(busc+" não está na lista!");
                    }
                    break;
                case 4:
                    l.printList();
                    break;
            }

        }while(op != 0);
    }
}
