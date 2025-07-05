package ProblemsFromChatGPT.Problem1.DynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {

    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();

        String target = "atcoder";
        long[] dp = new long[target.length()]; // dp[i] = jumlah subsekuens prefix target[0..i]

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // TODO: Loop dari belakang ke depan untuk update DP
            if (c == 'a') {

            }

            for (int j = target.length() - 1; j >= 0; j--) {
                if (c == target.charAt(j)) {
                    if (j == 0) {
                        // TODO: Huruf pertama dari target, mulai subsekuens baru
                        dp[0] = (dp[0] + 1) % MOD;
                    } else {
                        // TODO: Lanjutkan subsekuens dari huruf sebelumnya
                        dp[j] = (dp[j] + dp[j - 1]) % MOD;
                    }
                }
            }
        }

        // TODO: Print jumlah subsekuens lengkap yang terbentuk (dp[target.length() - 1])
        System.out.println(dp[target.length() - 1]);
    }
}
