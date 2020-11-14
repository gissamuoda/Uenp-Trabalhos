package exercicios.listaExercicios2.Num6;

public class Sort {
    public static int[] swap(int posi, int posiTroca, int[] arr){
        int aux = arr[posi];
        arr[posi] = arr[posiTroca];
        arr[posiTroca] = aux;

        return arr;
    }   
}
