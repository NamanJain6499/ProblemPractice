package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;


public class SmallOrEqualElement {
    public static void main(String args[]){
        SmallOrEqualElement element=new SmallOrEqualElement();
        int B=4;
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(15);
       // A.add(6);
        int answer=element.solve(A,B);
        System.out.println(answer);

    }

    private int solve(ArrayList<Integer> A,int B) {

        int n=A.size();
        int start=0,end=n-1;
        //count is initialized -1 as if only one element is there in arraylist then number of numbers which can be less than given number are either 0 or 1 but
        // while returning count we are adding 1  to it so it will return either 1 or 2 so initialize count with -1 to handle this situation
        int count=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(A.get(mid)<= B){
                start=mid+1;
                count=mid;
            }
            else end=mid-1;
        }

        return count+1;
    }

}
