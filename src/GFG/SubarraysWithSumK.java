package GFG;

import java.util.Arrays;

public class SubarraysWithSumK {
    public static void main(String[] args) {
        SubarraysWithSumK sumK=new SubarraysWithSumK();
        int[] Arr=new int[]{10 , 2, -2, -20, 10};
        int k=-10;
        int answer=sumK.solve(Arr,k,5);
        System.out.println(answer);
    }

    private int solve(int[] Arr, int k,int N) {

        int i=0;
        int j=0;
        int count=0;
        int sum=0;

        while(j<N){
            sum+=Arr[j];
            if(sum<k){
                j++;
            }else if(sum==k){
                count++;
                j++;
            }else if (sum>k){
                while(sum>k){
                    sum=sum-Arr[i];
                    if(sum==k){
                        count++;
                    }

                }
                i++;
                j++;
            }
        }
        return count;

    }
}
