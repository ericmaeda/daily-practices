package StringManipulation.StringTokenizer;

import java.util.ArrayList;
import java.util.Arrays;

public class BufferedReadMain {

    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        BufferedRead process = new BufferedRead();

        String filePath = "C:\\Users\\ericm\\IdeaProjects\\algorithms-and-data-structures\\src\\StringManipulation\\StringTokenizer\\test.txt";
        for (int i = 0; i < process.FileProcessing(filePath).size(); i++) {
            System.out.println(process.FileProcessing(filePath).get(i));
        }

        System.out.println(filePath.length());

        System.out.println(filePath.charAt(0));

        int[] array = {
                2,1,6,4,2,3,7,5
        };
    }
}
