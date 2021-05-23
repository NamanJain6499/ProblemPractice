package InterviewBitPractice.DynamicProgramming;

import java.util.ArrayList;
//solution
//https://www.youtube.com/watch?v=bUSaenttI24
public class zeroOneKnapsack {
    public static void main(String[] args) {
        zeroOneKnapsack knapsack = new zeroOneKnapsack();
        ArrayList<Integer> profit = new ArrayList<>();
        profit.add(10);
        profit.add(20);
        profit.add(30);
        profit.add(40);

        ArrayList<Integer> weight = new ArrayList<>();
        weight.add(12);
        weight.add(13);
        weight.add(15);
        weight.add(19);
        int C = 10;
        int answer = knapsack.solve(profit, weight, C);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> profit, ArrayList<Integer> weight, int C) {
        int[][] dp = new int[profit.size() + 1][C + 1];
        int n=profit.size();
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=C;i++){
            dp[0][i]=0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >=weight.get(i - 1)) {
                    int rCap = j - weight.get(i - 1);
                    if (dp[i - 1][rCap] + profit.get(i - 1) > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][rCap] + profit.get(i - 1);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][C];
    }
}
