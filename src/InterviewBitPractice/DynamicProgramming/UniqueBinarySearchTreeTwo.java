package InterviewBitPractice.DynamicProgramming;

//solution
//https://www.youtube.com/watch?v=H1qjjkm3P3c
public class UniqueBinarySearchTreeTwo {
    public static void main(String[] args) {
        UniqueBinarySearchTreeTwo bst = new UniqueBinarySearchTreeTwo();
        int A = 3;
        int answer = bst.solve(A);
        System.out.println(answer);
    }

    private int solve(int a) {
        int[] dp = new int[a + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < a + 1; i++) {
            int l = 0;
            int r = i - 1;
            while (l <i) {
                dp[i] += dp[l] * dp[r];
                l++;
                r--;
            }
        }
        return dp[a];
    }
}
