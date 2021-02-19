package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class Partitions {
    public static void main(String args[]) {
        int A = 4;
        ArrayList<Integer> B = new ArrayList<>();
        Partitions part = new Partitions();
        B.add(0);
        B.add(1);
        B.add(-1);
        B.add(0);
        int answer = part.solve(A, B);
        System.out.println(answer);


    }

    private int solve(int A, ArrayList<Integer> B) {
        int sum = 0;
        int i;
        int count = 0;
        int result = 0;
        int cummulativeSum = 0;

        for (i = 0; i < B.size(); i++) {
            sum += B.get(i);
        }

        if (sum % 3 != 0) {
            return 0;
        }

        for (i = 0; i < B.size(); i++) {
            cummulativeSum += B.get(i);

            if (cummulativeSum == ((2 * sum) / 3) && i >= 1 && i <= A - 2) {
                result += count;
            }

            if (cummulativeSum == sum / 3) {
                count += 1;
                // continue;
            }

        }
        return result;
    }
}
