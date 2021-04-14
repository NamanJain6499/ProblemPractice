package InterviewBitPractice.checkpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        LongestConsecutiveSequence sequence=new LongestConsecutiveSequence();
        A.add(100);
        A.add(4);
        A.add(200);
        A.add(1);
        A.add(2);
        A.add(3);
        int answer=sequence.longestConsecutive(A);
        System.out.println(answer);
    }

    private int longestConsecutive(ArrayList<Integer> A) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for (int i=0;i<A.size();i++){
            set.add(A.get(i));
        }
        //Solution
        //https://www.geeksforgeeks.org/longest-consecutive-subsequence/
        for (int i=0;i<A.size();i++){
            if (!set.contains(A.get(i)-1)){//If A.get(i) – 1 in the hash, if not found, then this is the first element a subsequence.
                int j=A.get(i);//get first element in j
                while (set.contains(j)){
                    j++;//next consecutive element if this is also present again check for next by adding 1
                }
                if (count<j-A.get(i)){
                    count=j-A.get(i);
                }
            }
        }
        return count;
    }
}
