package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        MaximumAbsoluteDifference max=new MaximumAbsoluteDifference();
        A.add(1);
        A.add(3);
        A.add(-1);
        int answer=max.solve(A);
        System.out.println(answer);
        }

    private int solve(ArrayList<Integer> A) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i=0;i<A.size();i++){
            max1=Math.max(max1,A.get(i)+i);
            min1=Math.min(min1,A.get(i)+i);
            max2=Math.max(max2,A.get(i)-i);
            min2=Math.min(min2,A.get(i)-i);
        }
        return Math.max(max1-min1,max2-min2);
    }
}
