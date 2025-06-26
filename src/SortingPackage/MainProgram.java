package SortingPackage;

public class MainProgram {

    public static void main(String[] args) {

        SortingAlgorithms sortArray = new SortingAlgorithms();

        // Bubble Sort implementation
        int[] array1 = {
                3,1,7,3,5,6,9,8,2
        };
        sortArray.BubbleSort(array1);
        System.out.print("Sorting with Bubble Sort method : ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Selection Sort implementation
        int[] array2 = {
                2,1,5,2,3,4,9,6,7,8,6
        };
        sortArray.SelectionSort(array2);
        System.out.print("Sorting with Selection Sort method : ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Insertion Sort implementation
        int[] array3 = {
                5,1,7,2,3,4,9,3,1
        };
        sortArray.InsertionSort(array3);
        System.out.print("Sorting with Insertion Sort method : ");
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Shell Sort implementation

        //TODO
    }
}
