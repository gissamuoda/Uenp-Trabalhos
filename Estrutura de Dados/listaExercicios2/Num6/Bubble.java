package exercicios.listaExercicios2.Num6;

public class Bubble extends Sort{
    static public int[] bubblesort(int arr[]){
        System.out.println("\n ...Bubble Sort...");
        int tam = arr.length;
        for (int out = (tam-1); out > 0; out--){
            for (int in = 0; in < out; in++){
                if (arr[in] > arr[in+1]){
                    arr = swap(in, (in+1), arr);
                }
            }
        }
        return arr;
    }
}
