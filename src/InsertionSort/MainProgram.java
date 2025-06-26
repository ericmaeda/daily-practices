package InsertionSort;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {
                2,1,8,4,2,9,1,7
        }; // array to be sorted

        // Initiate InsertionSort object
        InsertionSort SortArray = new InsertionSort();

        // Sort the array using Sort() method
        SortArray.Sort(array);

        // Print the array after it's sorted
        for (int k : array) {
            System.out.print(k + " ");
        }
    }
}
