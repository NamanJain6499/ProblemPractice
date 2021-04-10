package InterviewBitPractice.Backtracking;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class Permutations {
    public static void main(String args[]) {
        Permutations permutations = new Permutations();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        ArrayList<ArrayList<Integer>> answer=permutations.permute(A);
        System.out.println(answer);
    }

    private ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        permuteUntil(A,0,A.size(),result);
        return result;
    }

    private void permuteUntil(ArrayList<Integer> A, int left, int right, ArrayList<ArrayList<Integer>> result) {
        if (left==right){
            result.add(new ArrayList<>(A));
            return;
        }
        for (int i=left;i<right;i++){
            swap(A,left,i);
            permuteUntil(A,left+1,right, result);
            swap(A,left,i);
        }
    }
    void swap(ArrayList<Integer> A, int l, int r){
        int temp = A.get(l);
        A.set(l,A.get(r));
        A.set(r,temp);
    }


}
