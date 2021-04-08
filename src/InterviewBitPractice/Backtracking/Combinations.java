package InterviewBitPractice.Backtracking;

import java.util.ArrayList;

public class Combinations {
    public static void main(String args[]) {
        Combinations combinations = new Combinations();
        int n = 4;
        int k = 2;
        ArrayList<ArrayList<Integer>> answer = combinations.combine(n, k);
        System.out.println(answer);
    }

    ArrayList<ArrayList<Integer>> result;

    public ArrayList<ArrayList<Integer>> combine(int A, int B) {

        result = new ArrayList<ArrayList<Integer>>();

        if (B == 0)
            return result;

        makeCombinations(1, A, B, new ArrayList<Integer>());

        return result;
    }

    private void makeCombinations(int start, int n, int k, ArrayList<Integer> list) {
        if (list.size() == k) {     //when the size of list is equal to kwe add list to result and return to the last makeCOmbination
                                   // function and remove the list.size()-1 th element
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = start; i <= n; i++) {

            list.add(i);

            makeCombinations(i + 1, n, k, list);

            list.remove(list.size() - 1);

        }
    }


}
