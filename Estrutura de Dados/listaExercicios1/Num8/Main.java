package exercicios.listaExercicios1.Num8;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Quantidade na lista: ");
        int tam = sc.nextInt();
        sc.nextLine();

        Lista l = new Lista(tam);

        for(int i = 0; i < tam; i++){
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Conta: ");
            int conta = sc.nextInt();
            System.out.println("Agencia: ");
            int agencia = sc.nextInt();
            System.out.println("Saldo: ");
            Double saldo = sc.nextDouble();

            sc.nextLine();
            Conta n = new Conta(nome, conta, agencia, saldo);

            l.cadastra(n);
        }

        l.imprime();

        System.out.println("___________Busca____________");
        System.out.print("Nome para realizar busca: ");
        String busc = sc.nextLine();

        int posibusca = l.buscaConta(busc);
        if(posibusca > -1){
            System.out.println("Foi encontrado o cadastro da posição "+posibusca);
        } else {
            System.out.println("Não foi encontrado cadastro");
        }

        
        System.out.println("___________Deposito____________");
        System.out.println("Nome da pessoa a realizar o deposito: ");
        String dep = sc.nextLine();
        int posiDep = l.buscaConta(dep);

        System.out.println("Valor a ser depositado: ");
        Double valorDep = sc.nextDouble();
        sc.nextLine();

        l.depositar(valorDep, posiDep);

        l.imprime();
        
        System.out.println("___________Retirada____________");
        System.out.println("Nome da pessoa a realizar a retirada: ");
        String ret = sc.nextLine();
        int posiRet = l.buscaConta(ret);

        System.out.println("Valor a ser retirado: ");
        Double valorRet = sc.nextDouble();
        sc.nextLine();

        l.depositar(valorRet, posiRet);

        l.imprime();

    }
}
