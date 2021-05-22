package InterviewBitPractice.GreedyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LargestPermutation {
    public static void main(String[] args) {
        LargestPermutation permutation=new LargestPermutation();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(1);
        A.add(3);
        int B=3;
        ArrayList<Integer> answer=permutation.solve(A,B);
        System.out.println(answer);
    }

    private ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=A.size();
        for (int i=0;i<n;i++){
            map.put(A.get(i),i);
        }
        ArrayList<Integer> temp=new ArrayList<>(A);
        Collections.sort(temp);
        if (B>=n){
            Collections.sort(A,Collections.reverseOrder());
        }
        else {
            for(int i=0;i<B;i++){
                int map_max=Collections.max(temp);
                int max_index=map.get(map_max);
                int val=A.get(i);
                A.set(i,A.get(max_index));
                A.set(max_index,val);
                temp.remove(temp.size()-1);
            }
        }
        return A;

    }
}
