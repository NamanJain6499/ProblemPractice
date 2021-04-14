package InterviewBitPractice.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PairsWithGivenXor {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(3);
        A.add(6);
        A.add(8);
        A.add(10);
        A.add(15);
        A.add(50);
        int B=5;
        PairsWithGivenXor xor=new PairsWithGivenXor();
        int answer=xor.solve(A,B);
        System.out.println(answer);

    }

    private int solve(ArrayList<Integer> A, int B) {
        //This solution exceeds time in interviewbit the one which is marked comments
        //HashMap<Integer,Integer> map=new HashMap<>();
        //int count=0;
        //for (int i=0;i<A.size();i++){
        //    map.put(i,A.get(i));
        //}
        //for (int i=0;i<A.size();i++){
        //    int xor=A.get(i)^B;
        //    if (map.containsValue(xor)){
        //        count++;
        //    }
        //}
        //return count/2;
        HashSet<Integer> s = new HashSet<Integer>();
        int count=0;
        for (int i = 0; i < A.size(); i++)
        {
            if (s.contains(B^A.get(i)))
            {
                count++;
            }
            s.add(A.get(i));
        }
        return count;
    }
}
