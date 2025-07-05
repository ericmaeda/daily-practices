package ProblemsFromChatGPT.Problem1.DynamicProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Diberikan sebuah string S yang hanya terdiri dari huruf kecil 'e', 'r', 'i', dan 'c'.
 * Hitung ada berapa subsequence "eric" yang bisa dibentuk dari S.
 */

public class Problem2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        long e = 0, er = 0, eri = 0, eric = 0;

        for (char c : str.toCharArray()) {
            if (c == 'e') {
                e++;
            }
            else if (c == 'r') {
                er += e;
            }
            else if (c == 'i') {
                eri += er;
            }
            else if (c == 'c') {
                eric += eri;
            }
        }

        System.out.println(eric);
    }
}
