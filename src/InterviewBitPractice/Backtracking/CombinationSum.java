package InterviewBitPractice.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
    public static void main(String args[]){
        CombinationSum  combinationSum=new CombinationSum();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(8);
        A.add(10);
        A.add(6);
        A.add(11);
        A.add(1);
        A.add(16);
        A.add(8);
        //A : [ 8, 10, 6, 11, 1, 16, 8 ]
        //B : 28
        int target=28;
        ArrayList<ArrayList<Integer>> answer=combinationSum.sum(A,target);
        System.out.println(answer);
    }

    private ArrayList<ArrayList<Integer>> sum(ArrayList<Integer> A, int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if (A==null || A.size()==0) return result;
        Collections.sort(A);
        backtrack(A,0,target,new ArrayList(),result);
        return result;
    }

    private void backtrack(ArrayList<Integer> A, int start, int target, ArrayList list, ArrayList<ArrayList<Integer>> result) {
        if(target<0){
            return;
        }
        if (target==0){
            result.add(new ArrayList<>(list));
        }
        for (int i=start;i<A.size();i++){
            if (i==start || A.get(i)!=A.get(i-1)) {
                list.add(A.get(i));
                backtrack(A, i, target - A.get(i), list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
