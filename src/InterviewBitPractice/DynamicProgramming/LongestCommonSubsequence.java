package InterviewBitPractice.DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        LongestCommonSubsequence common=new LongestCommonSubsequence();
        String A="abbcdgf";
        String B="bbadcgf";
        int answer=common.solve(A,B);
        System.out.println(answer);
    }

    private int solve(String A, String B) {
        int n=A.length();
        int m=B.length();
        int [][]dp=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
