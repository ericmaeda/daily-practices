package BubbleSort;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {
                3,1,2,9,7,8,6
        };

        BubbleSort SortArray = new BubbleSort();

        SortArray.Sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
