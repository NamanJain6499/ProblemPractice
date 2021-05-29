package InterviewBitPractice.DynamicProgramming;

//solution
//https://www.youtube.com/watch?v=pEYwLmGJcvs
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        MatrixChainMultiplication multiplication = new MatrixChainMultiplication();
        int N = 4;
        int[] arr = new int[]{10, 30, 5, 60};
        int answer = multiplication.matrixMultiplication(N, arr);
        System.out.println(answer);

    }

    private int matrixMultiplication(int N, int[] arr) {
        int dp[][] = new int[arr.length - 1][arr.length - 1];
        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {
                if (g == 0) {
                    dp[i][j] = 0;
                } else if (g == 1) {
                    dp[i][j] = arr[i] * arr[j] * arr[j + 1];
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        int lc = dp[i][k];
                        int rc = dp[k + 1][j];
                        int mc = arr[i] * arr[k + 1] * arr[j + 1];
                        int tc = lc + rc + mc;
                        if (tc < min) {
                            min = tc;
                        }
                    }
                    dp[i][j] = min;
                }
            }
        }
        return dp[0][dp.length - 1];
    }
}
