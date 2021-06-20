package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class BalanceArray {
    public static void main(String[] args) {
        BalanceArray balanceArray = new BalanceArray();
        ArrayList<Integer> A = new ArrayList<>();
        // A : [ 7, 2, 5, 3, 4, 3, 3, 2 ]
        A.add(5);
        A.add(5);
        A.add(2);
        A.add(5);
        A.add(8);
//        A.add(3);A.add(3);
//        A.add(2);

        int answer = balanceArray.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        int sum = 0;
        int count = 0;
        int element = 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);
        }

        for (int j = 0; j < A.size(); j++) {
            int remSum = sum - A.get(j);
            if (remSum % 2 == 0) {
                element = A.remove(j);
                int even = 0;
                for (int k = 0; k < A.size(); k += 2) {
                    even += A.get(k);
                }
                if (even == remSum / 2) {
                    count += 1;
                }
                A.add(j, element);
            }

        }

        return count;
    }
}
