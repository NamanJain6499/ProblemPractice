package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class PickFromBothSides {
    public static void main(String args[]){
        PickFromBothSides pick=new PickFromBothSides();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(5);
        A.add(-2);
        A.add(3);
        A.add(1);
        A.add(2);
        int B=3;
        int sum=pick.solve(A,B);
        System.out.println(sum);
    }

    private int solve(ArrayList<Integer> A, int B) {
        int size=A.size();
        int sum1=0,sum2=0,min;
        //This gives us total sum of ArrayList
        for (int i=0;i<size;i++){
            sum1+=A.get(i);
        }
        //Find minimum sum of size-B contigous element and subtract from total sum which is sum1 to get maximum sum from both sides.
        int i=0,j=size-B-1;
        for (int k=i;k<=j;k++){
            sum2+=A.get(k);
        }
        min=sum2;i++;j++;
        //now we need to add next element and delete previous element  from sum2.
        while (j<size){
            sum2+=A.get(j)-A.get(i-1);
            min=Math.min(sum2,min);
            i++;j++;
        }
        return sum1-min;
    }
}
