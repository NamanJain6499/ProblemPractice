package InterviewBitPractice.DynamicProgramming;

//solution
//https://www.youtube.com/watch?v=wuOOOATz_IA
public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        LongestPalindromicSubsequence palindromicSubsequence = new LongestPalindromicSubsequence();
        String A="bebeeed";
        int answer=palindromicSubsequence.solve(A);
        System.out.println(answer);
    }
    //Logic
    //Here we are applying Longest common subsequence problem taking first string as given and next string B is reverse of A(the first string)
    //this after applying LCS on these 2 string we get the length of longest palindromic subsequence.
    private int solve(String A) {
        StringBuilder B=new StringBuilder(A);
        B.reverse();
        return solve(A,B.toString());
    }

    private int solve(String A, String B) {
        int n=A.length();
        int m=B.length();
        int [][]dp=new int[n+1][m+1];

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
