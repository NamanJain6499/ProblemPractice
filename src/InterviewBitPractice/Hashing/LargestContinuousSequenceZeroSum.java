package InterviewBitPractice.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestContinuousSequenceZeroSum {
    public static void main(String args[]){
        LargestContinuousSequenceZeroSum sequenceZeroSum=new LargestContinuousSequenceZeroSum();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(-3);
       A.add(3);
       //A.add(1);
       //A.add(7);
       //A.add(10);
       //A.add(23);
        ArrayList<Integer> answer=sequenceZeroSum.lszero(A);
        System.out.println(answer);
    }

    private ArrayList<Integer> lszero(ArrayList<Integer> A) {
        Map<Integer, Integer> store = new HashMap<>();
        int left=1,right=-1,currentSum=0;
        store.put(0, -1);
        for(int i=0;i<A.size();i++){
            currentSum += A.get(i);
            if(store.containsKey(currentSum)){
                int l = store.get(currentSum)+1;
                if(i-l > right-left){
                    left = l;
                    right = i;
                }
            } else
                store.put(currentSum, i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(left==-1)
            return result;
        for(int i=left;i<=right;i++)
            result.add(A.get(i));
        return result;
    }
}
