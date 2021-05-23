package InterviewBitPractice.GreedyProblems;

import java.util.ArrayList;
import java.util.Arrays;
//solution
//https://www.youtube.com/watch?v=h6_lIwZYHQw

public class DistributeCandy {
    public static void main(String[] args) {
        DistributeCandy candy = new DistributeCandy();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(5);
        A.add(2);
        A.add(1);
        int answer = candy.minCandy(A);
        System.out.println(answer);
    }

    public int minCandy(ArrayList<Integer> A) {
        int count = 0;
        int[] L2R = new int[A.size()];
        int[] R2L = new int[A.size()];
        //how to initialize array with 1 so each get atleast 1 candy.
        Arrays.fill(L2R, 1);
        Arrays.fill(R2L, 1);
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > A.get(i - 1)) {
                L2R[i] = L2R[i - 1] + 1;
            }
        }
        for (int i = A.size() - 2; i >= 0; i--) {
            if (A.get(i) > A.get(i + 1)) {
                R2L[i] = R2L[i + 1] + 1;
            }
        }
        for (int i = 0; i < L2R.length; i++) {
            int candy = Math.max(L2R[i], R2L[i]);
            count = count + candy;
        }
        return count;
    }
}
