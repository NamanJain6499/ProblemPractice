package InterviewBitPractice.DynamicProgramming;

public class LongestCommomSubstring {
    public static void main(String[] args) {
        LongestCommomSubstring substring=new LongestCommomSubstring();
        String S1="ABCDGH";
        String S2="ACDGHR";
        int answer=substring.longestCommonSubstr(S1,S2,S1.length(),S2.length());
        System.out.println(answer);
    }


    private int longestCommonSubstr(String S1, String S2, int n, int m) {
        int [][] dp=new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(S1.charAt(i-1)==S2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[n][m-1];
    }

}
