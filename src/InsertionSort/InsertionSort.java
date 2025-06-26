package InsertionSort;

public class InsertionSort {

    public void Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i;
            while ((k > 0) && (temp < arr[k-1])) {
                arr[k] = arr[k-1];
                k--;
            }
            arr[k] = temp;
        }
    }
}
