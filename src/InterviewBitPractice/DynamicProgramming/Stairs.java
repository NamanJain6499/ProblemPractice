package InterviewBitPractice.DynamicProgramming;
//solution
//https://www.youtube.com/watch?v=uHAToNgAPaM
public class Stairs {
    public static void main(String[] args) {
        Stairs stairs=new Stairs();
        int A=5;
        int answer=stairs.solve(A);
        System.out.println(answer);

    }

    private int solve(int A) {
        int dp[]=new int[A+1];
        dp[0]=1;
        dp[1]=1;
        for (int i=2;i<=A;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[A];
    }
}
