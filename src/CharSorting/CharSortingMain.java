package CharSorting;

public class CharSortingMain {

    public static void main(String[] args) {
        CharSorting sortArr = new CharSorting();

        char[] arr = {
          'q','t','a','h','a','x','d','c','b'
        };
        sortArr.SortChar(arr);

        for (char c : arr) {
            System.out.print(c);
        }
    }
}
