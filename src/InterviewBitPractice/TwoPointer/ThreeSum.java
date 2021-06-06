package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(-1);
        A.add(2);
        A.add(1);
        A.add(4);
        int B=1;
        int sum=threeSum.solve(A,B);
        System.out.println(sum);
    }

    private int solve(ArrayList<Integer> a, int b) {
        int n=a.size();
        int sum=0;
        if(n<=3){
            for (int i=0;i<n;i++){
                sum+=a.get(i);
            }
            return sum;
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<i;j++){
                for (int k=j+1;k<n;k++){

                }
            }
        }
        return 0;
    }
}
