package InterviewBitPractice.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum2 {
    public static void main(String args[]){
        CombinationSum2 sum2=new CombinationSum2();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(10);
        A.add(1);
        A.add(2);
        A.add(7);
        A.add(6);
        A.add(1);
        A.add(5);
        int target=8;
        ArrayList<ArrayList<Integer>> answer=sum2.combinationSum(A,target);
        System.out.println(answer);
    }

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int target) {
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
                backtrack(A, i+1, target - A.get(i), list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
