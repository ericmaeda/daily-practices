package InsertionSort;

public class InsertionSort {

    public void Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while ((j > 0) && (temp < arr[j-1])) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
