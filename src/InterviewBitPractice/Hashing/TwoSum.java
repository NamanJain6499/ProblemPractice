package InterviewBitPractice.Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String args[]){
        TwoSum twoSum=new TwoSum();
        ArrayList<Integer> A=new ArrayList<>();
        //arr[] = {0, -1, 2, -3, 1}
        //        sum = -2
        //Output: -3, 1
        A.add(3);
        A.add(-1);
        A.add(2);
        A.add(1);
        A.add(-2);
        int target=0;
        ArrayList<Integer> answer=twoSum.solve(A,target);
        System.out.println(answer);
    }

    private ArrayList<Integer> solve(ArrayList<Integer> A, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int index1=0;
        int index2=0;
        for (int i=0;i<A.size();i++){
            map.put(A.get(i),i+1);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<A.size();i++){
            int nextNo=target-A.get(i);
            if (map.containsKey(nextNo)){
                int index=map.get(nextNo);
                if (index>i+1){
                    index2=index;
                    index1=i+1;
                    break;

                }
            }

        }
        result.set(0,index1);
        result.set(1,index2);
        Collections.sort(result);
        return result;
    }
}
