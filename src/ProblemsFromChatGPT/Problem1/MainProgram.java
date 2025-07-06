package ProblemsFromChatGPT.Problem1;
import java.math.BigInteger;

public class MainProgram {

    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n-1) + fib(n - 2);
    }

    // a dummy class for experimenting.
    public static void main(String[] args) {
        // Waktu mulai
        long startTime = System.nanoTime();

        // Contoh program yang ingin diukur kecepatannya
        long n = fib(41);

        // Waktu selesai
        long endTime = System.nanoTime();

        // Hitung durasi (dalam nanodetik dan milidetik)
        long durationNano = endTime - startTime;
        double durationMillis = durationNano / 1_000_000.0;

        System.out.println("Hasil perhitungan: " + n);
        System.out.println("Waktu eksekusi: " + durationNano + " ns (" + durationMillis + " ms)");

    }
}
