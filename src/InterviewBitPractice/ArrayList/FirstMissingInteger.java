package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

//Link for video
//https://www.youtube.com/watch?v=-lfHWWMmXXM&t=561s
public class FirstMissingInteger {
    public static void main(String args[]) {
        FirstMissingInteger missingInteger = new FirstMissingInteger();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(4);
        A.add(7);
        A.add(1);
        int answer = missingInteger.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            int correctPos = A.get(i) - 1;
            while (A.get(i) >= 1 && A.get(i) <= n && A.get(i) != A.get(correctPos)) {
                int temp = A.get(i);
                A.set(i, A.get(correctPos));
                A.set(correctPos, temp);
                correctPos = A.get(i) - 1;
            }

        }
        for (int i = 0; i < n; i++) {
            if (i + 1 != A.get(i)) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
