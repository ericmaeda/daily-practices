package SelectionSort;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {
                2,8,1,3,5,2,4,7
        };

        SelectionSort SortArray = new SelectionSort();

        SortArray.Sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

        char[] array1 = {
                'z','y','x'
        };


    }
}
