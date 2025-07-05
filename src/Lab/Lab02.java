package Lab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab02 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        long s = 0;
        long sd = 0;
        long sda = 0;

        for (char c : str.toCharArray()) {
            if (c == 's') {
                s++;
            }
            else if (c == 'd') {
                sd += s;
            }
            else if (c == 'a') {
                sda += sd;
            }
        }

        System.out.println(sda);
    }
}
