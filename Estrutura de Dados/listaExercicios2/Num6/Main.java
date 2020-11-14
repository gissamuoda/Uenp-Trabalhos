package exercicios.listaExercicios2.Num6;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 4, 15, 27, 1, 0, 99};

        int bubble[] = Bubble.bubblesort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(i+": "+bubble[i]+" | ");
        }

        
        int insertion[] = Insertion.insertionSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(i+": "+insertion[i]+" | ");
        }


        int selection[] = Selection.selectionSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(i+": "+selection[i]+" | ");
        }
    }
}
