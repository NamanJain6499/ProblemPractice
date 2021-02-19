package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MaxDistance {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        MaxDistance distance=new MaxDistance();
        int answer=distance.maximumGap(list);
        System.out.println(answer);
    }

    private int maximumGap(List<Integer> A) {
        int n=A.size();
        int [] rightMax=new int[n];
        rightMax[n-1]=A.get(n-1);
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],A.get(i));
        }
        int i=0,j=0,maxGap=0;
        while (i<n && j<n){
            if(rightMax[j]>=A.get(i)){
                maxGap=Math.max(maxGap,j-i);
                j++;
            }
            else {
                i++;
            }
        }
        return maxGap;
    }


}
