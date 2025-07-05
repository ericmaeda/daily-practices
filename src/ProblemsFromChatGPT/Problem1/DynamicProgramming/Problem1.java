package ProblemsFromChatGPT.Problem1.DynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Diberikan sebuah string S yang hanya terdiri dari huruf kecil 'a', 'b', dan 'c'.
 * Hitung ada berapa subsequence "abc" yang bisa dibentuk dari S.
 */

public class Problem1 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        long a = 0;
        long ab = 0;
        long abc = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a') {
                a++;
            }
            else if (c == 'b') {
                ab += a;
            }
            else if (c == 'c') {
                abc += ab;
            }
        }

        System.out.println(abc);
    }
}
