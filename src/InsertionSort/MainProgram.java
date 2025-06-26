package InsertionSort;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {
                2,1,8,4,2,9,1,7
        };

        InsertionSort SortArray = new InsertionSort();

        SortArray.Sort(array);

        for (int k : array) {
            System.out.print(k + " ");
        }
    }
}
