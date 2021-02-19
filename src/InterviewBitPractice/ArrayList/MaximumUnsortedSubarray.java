package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

//https://www.interviewbit.com/problems/maximum-unsorted-subarray/

public class MaximumUnsortedSubarray {
    public  static void main(String args[]){
        MaximumUnsortedSubarray indexRange=new MaximumUnsortedSubarray();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(2);
        A.add(4);
        A.add(5);
        ArrayList<Integer> answer=new ArrayList<>();
        answer=MaximumUnsortedSubarray.subUnsort(A);
        System.out.println(answer);
    }


    //find the starting node where first time the value of element is greater then next element.
    //them start from ending for finding ending element of unsorted array  so if the next element from end is greater than previous
    // break and you got ending point also.
    //now you have both starting and ending of unsorted array .
    //so you need to find minimum and maximum of unsorted array
    //now check from starting to element previous to "s" that if any element is still less than that minimum in unsorted array  then replace s with i.
    //check from ending that is there any value which is greater than maximum of unsorted array replace e with that value.
    private static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int n=A.size();
        int s=0,e=n-1,i,min,max;
        ArrayList<Integer> result=new ArrayList<>();
        for(s=0;s<n-1;s++){
            if(A.get(s)>A.get(s+1)){
                break;
            }
        }
        if (s==n-1){
            result.add(-1);
            return result;
        }

        for (e=n-1;e>0;e--){
            if (A.get(e-1)>A.get(e)){
                break;
            }
        }
        max=A.get(s);
        min=A.get(s);
        for (i=s+1;i<=e;i++){
            if(A.get(i)>max){
                max=A.get(i);
            }
            if (A.get(i)<min){
                min=A.get(i);
            }
        }
        for (i=0;i<s;i++){
            if(A.get(i)>min){
                s=i;
                break;
            }
        }
        for (i=n-1;i>=e+1;i--){
            if (A.get(i)<max){
                e=i;
                break;
            }
        }

        result.add(s);
        result.add(e);

        return result;
    }
}
