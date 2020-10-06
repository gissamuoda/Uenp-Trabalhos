package exercicios.listaExercicios1;

import java.util.Scanner;

public class Num6 {
    static Scanner sc = new Scanner(System.in); 
    static int TAM = 5;
    public static void main(String[] args) {
        int mat[][] = new int[TAM][TAM];

        System.out.println("Entradas da matriz");
        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("_______________________________________________");
        System.out.println("Soma da linha: ");
        int linha = sc.nextInt();
        int somaLinha = 0;

        for(int i = 0; i < TAM; i++){
            somaLinha += mat[linha][i];
            System.out.print(mat[linha][i]+"+");
        }
        
        System.out.println("Resultado soma da "+linha+" linha: "+somaLinha);

        System.out.println("_______________________________________________");
        System.out.println("Soma da coluna: ");
        int coluna = sc.nextInt();
        int somaColuna = 0;

        for(int i = 0; i < TAM; i++){
            somaColuna += mat[i][coluna];
            System.out.print(mat[i][coluna]+"+");
        }

        System.out.println("Resultado soma da "+coluna+" coluna: "+somaColuna);

        System.out.println("_______________________________________________");
        System.out.println("Soma da diagonal principal");
        int somaDiagonal = 0;

        for(int i = 0; i < TAM; i++){
            somaDiagonal += mat[i][i];
        }

        System.out.println("Resultado da soma da diagonal principal: "+somaDiagonal);
        
        System.out.println("_______________________________________________");
        System.out.println("Soma da diagonal secundária");
        int somaDiagonalS = 0;

        for(int i = 0; i < TAM; i++){
            for(int j = TAM-1; j >= 0; j--){
                if( i + j == TAM-1){
                    somaDiagonalS += mat[i][j];
                }
            }
        }

        System.out.println("Resultado da soma da diagonal secundária: "+somaDiagonalS);

        System.out.println("_______________________________________________");
        System.out.println("Soma da matriz");
        int somaMatriz = 0;

        for(int i = 0; i < TAM; i++){
            for(int j = TAM-1; j >= 0; j--){
                somaMatriz += mat[i][j];
            }
        }

        System.out.println("Resultado da soma da Matriz: "+somaMatriz);

    }
}
