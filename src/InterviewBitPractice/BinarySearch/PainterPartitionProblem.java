package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;

//solution
//https://www.youtube.com/watch?v=9BnC7orwkNA&t=19s
public class PainterPartitionProblem {
    public static void main(String args[]) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(1000000);
        C.add(1000000);
        //C.add(11);
        //C.add(3);
        int A = 1;
        int B = 1000000;
        PainterPartitionProblem partition = new PainterPartitionProblem();
        long   answer = partition.paint(A, B, C);
        System.out.println((answer*B)% 10000003 );
    }

    private int paint(int A, int B, ArrayList<Integer> C) {
        int n = C.size();
        int start = 0;
        int s = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            s += C.get(i);

        }
        //minimum time required by the painter to paint maximum length board is starting and maximum time required to paint board
        // with only one painter taker time equal to add all integer in C
        int end = s;

        //initially we are taking B=1 as each take one unit time for unit board.
        while (start <= end) {
            int mid = (start + end) / 2;

            if (solve(A, B, mid,  C, n)) {//here we will check that if in given number of painter we can  paint board or not
                ans = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return (int) ans;
    }

    private boolean solve(int A, int B, int mid, ArrayList<Integer> C, int n) {
        int sum = 0;
        int painter = 1;
        for (int i = 0; i < n; i++) {
            if (C.get(i) > mid) return false;
            if (C.get(i) + sum > mid) {
                painter++;
                sum = C.get(i);
                if (painter > A) return false;
            } else
                sum += C.get(i);
        }
        return true;
    }

}
