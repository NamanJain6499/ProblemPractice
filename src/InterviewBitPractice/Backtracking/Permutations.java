package InterviewBitPractice.Backtracking;

import java.util.ArrayList;

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

    private ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        return null;
    }
}
