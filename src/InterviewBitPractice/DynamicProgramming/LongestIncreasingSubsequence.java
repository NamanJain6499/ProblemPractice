package InterviewBitPractice.DynamicProgramming;

import java.util.ArrayList;
//Best Solution must watch again
//https://www.youtube.com/watch?v=odrfUCS9sQk
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        LongestIncreasingSubsequence longest = new LongestIncreasingSubsequence();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(1);
        A.add(5);
        int length = longest.len(A);
        System.out.println(length);
    }

    private int len(ArrayList<Integer> A) {
        int n = A.size();
        int[] dp = new int[n];
        int omax = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (A.get(j) < A.get(i)) {
                    if (dp[j] > max) {
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;

            if (dp[i] > omax) {
                omax = dp[i];
            }
        }
        return omax;
    }
}
