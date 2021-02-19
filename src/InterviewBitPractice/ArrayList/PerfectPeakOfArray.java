package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class PerfectPeakOfArray {
    public static void main (String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(5);A.add(1);A.add(4);A.add(3);A.add(6);A.add(8);A.add(10);A.add(7);A.add(9);
        PerfectPeakOfArray peak=new PerfectPeakOfArray();
        int answer=peak.solve(A);
        System.out.println(answer);
    }
    //Create two arrays leftMax[] and rightMin[].
    //Traverse input array from left to right and fill leftMax[] such that leftMax[i] contains maximum element from 0 to i-1 in input array.
    //Traverse input array from right to left and fill rightMin[] such that rightMin[i] contains minimum element from to N-1 to i+1 in input array.
    //Traverse input array. For every element A[i], check if A[i] is greater than leftMax[i] and smaller than rightMin[i]. If yes, return 1.
    //If loops exits and no such element found return 0

    private int solve(ArrayList<Integer> A) {
        int n=A.size();
        int leftMax[] = new int[n];
        int rightmin[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        leftMax[0]=0;
        rightmin[n-1]=0;
        for (int i=1;i<n;i++){
            max=Math.max(A.get(i-1),max);
            leftMax[i]=max;
        }
        for (int i=n-2;i>0;i--){
            min=Math.min(A.get(i+1),min);
            rightmin[i]=min;
        }
        for (int i=0;i<n;i++){
            if(A.get(i)>leftMax[i] && A.get(i)<rightmin[i]){
                return 1;
            }

        }
        return 0;

    }
}
