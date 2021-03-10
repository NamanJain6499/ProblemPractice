package InterviewBitPractice.StackAndQueue;

import java.util.ArrayList;

public class RainWaterTrapped {
    public static void main(String args[]){
        RainWaterTrapped rainWaterTrapped=new RainWaterTrapped();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(0);
        A.add(2);
        A.add(1);
        A.add(0);
        A.add(1);
        A.add(3);
        A.add(2);
        A.add(1);
        A.add(2);
        A.add(1);
        int ans=rainWaterTrapped.solve(A);
        System.out.println(ans);
    }

    private int solve(ArrayList<Integer> A) {
        int n=A.size();
        int []left= new int[n];
        int []right= new int[n];
        left[0]=A.get(0);
        for(int i=1;i<n;i++){
            left[i]= Math.max(A.get(i),left[i-1]);
        }
        right[n-1]= A.get(n-1);
        for(int i=n-2;i>=0;i--){
            right[i]= Math.max(A.get(i),right[i+1]);
        }
        int count=0;
        for(int i=0;i<n;i++){
            int p= Math.min(left[i],right[i]);
            count+=p-A.get(i);
        }
        return count;
    }
}
