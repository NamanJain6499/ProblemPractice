package InterviewBitPractice.DynamicProgramming;


//prerequisites  :Longest common sub sequence
//solution
//https://www.youtube.com/watch?v=hbTaCmQGqLg
public class RepeatingSubSequence {
    public static void main(String[] args) {
        RepeatingSubSequence repeating = new RepeatingSubSequence();
        String A = "aabb";
        int answer = repeating.solve(A);
        System.out.println(answer);
    }

    private int solve(String A) {
        String B = new String(A);
        int n = A.length();
        int m = B.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m] >= 2 ? 1 : 0;

    }
}
