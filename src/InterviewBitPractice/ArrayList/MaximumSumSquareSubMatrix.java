package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class MaximumSumSquareSubMatrix {
    public static void main(String args[]){
        int B=3;
        MaximumSumSquareSubMatrix subMatrix=new MaximumSumSquareSubMatrix();
        ArrayList<ArrayList<Integer>> A=new ArrayList<>();
        A.add(new ArrayList<>());
        A.get(0).add(1);A.get(0).add(1);A.get(0).add(1);A.get(0).add(1);A.get(0).add(1);
        A.add(new ArrayList<>());
        A.get(1).add(2);A.get(1).add(2);A.get(1).add(2);A.get(1).add(2);A.get(1).add(2);
        A.add(new ArrayList<>());
        A.get(2).add(3);A.get(2).add(8);A.get(2).add(6);A.get(2).add(7);A.get(2).add(3);
        A.add(new ArrayList<>());
        A.get(3).add(4);A.get(3).add(4);A.get(3).add(4);A.get(3).add(4);A.get(3).add(4);
        A.add(new ArrayList<>());
        A.get(4).add(5);A.get(4).add(5);A.get(4).add(5);A.get(4).add(5);A.get(4).add(5);
        int sum=subMatrix.solve(A,B);
        System.out.println(sum);
    }

    private int solve(ArrayList<ArrayList<Integer>> A, int B) {

        int n=A.size();
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i+B<=n && j+B<=n){
                    int sum=0;
                    for (int k=i;k<i+B;k++){
                        for (int l=j;l<j+B;l++){
                            sum+=A.get(k).get(l);
                        }
                    }
                    maxSum=Math.max(maxSum,sum);
                }
            }
        }

        return maxSum;
    }


}
