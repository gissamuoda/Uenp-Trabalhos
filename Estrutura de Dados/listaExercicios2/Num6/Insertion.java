package exercicios.listaExercicios2.Num6;

public class Insertion extends Sort{
    static public int[] insertionSort(int arr[]){
        System.out.println(" \n ...Intertion Sort..."); 
        for(int out = 1; out < arr.length; out++){
            for(int in = out; in > 0; in--){
                if(arr[in] < arr[in-1]){
                    arr = swap(in, (in-1), arr);
                }else{
                    break;
                }			
            }
        }
        return arr;
    }
}
