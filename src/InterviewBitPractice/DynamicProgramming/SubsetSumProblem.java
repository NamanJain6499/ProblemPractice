package InterviewBitPractice.DynamicProgramming;

import java.util.ArrayList;
//A : [ 77, 32, 9, 45, 40, 27, 24, 38, 39, 19, 83, 30, 42, 34, 16, 40 ]
//        B : 659
public class SubsetSumProblem {
    public static void main(String[] args) {
        SubsetSumProblem sum=new SubsetSumProblem();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(77);
        A.add(32);
        A.add(9);
        A.add(45);
        A.add(40);
        A.add(27);
        A.add(24);
        A.add(38);
        A.add(39);
        A.add(19);
        A.add(83);
        A.add(30);
        A.add(42);
        A.add(34);
        A.add(16);
        A.add(40);
        int B=659;
        int answer=sum.solve(A,B);
        System.out.println(answer);
    }

    public int solve(ArrayList<Integer> A, int B) {
        if(possible(A,B)==true){
            return 1;
        }
        return 0;
    }
    public  boolean possible(ArrayList<Integer> A, int B){
        boolean dp[][]=new boolean[A.size()+1][B+1];
        for(int i=0;i<B+1;i++){
            dp[0][i]=false;
        }
        for(int i=0;i<A.size()+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=A.size();i++){
            for(int j=1;j<=B;j++){
                if(A.get(i-1)<=j){
                    dp[i][j]=dp[i-1][j-A.get(i-1)] || dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[A.size()][B];
    }
}
