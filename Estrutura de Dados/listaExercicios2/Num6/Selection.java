package exercicios.listaExercicios2.Num6;

public class Selection extends Sort{
    static public int[] selectionSort(int arr[]){
        System.out.println("\n ...Selection Sort...");
        
        int posi = 0;
        int aux = arr[0];
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j <arr.length; j++){
                if (aux>arr[j]){
                    posi = j;
                    aux = arr[j];
                }
            }
            if(aux>arr[posi]){
                arr = swap(i, posi, arr);
            }
        }
        return arr;
    }
}
