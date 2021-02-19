package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;

//youtube video solution
//https://www.youtube.com/watch?v=q1mgS0ZtLBE
public class SortedInsertPosition {
    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();
        int B = 10;
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(6);
        SortedInsertPosition position = new SortedInsertPosition();
        int answer = position.searchInsert(A, B);
        System.out.println(answer);
    }

    private int searchInsert(ArrayList<Integer> a, int b) {
        int n = a.size();
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a.get(mid) == b) {
                return mid;
            } else if (a.get(mid) < b) {
                start = mid + 1;
            } else if (a.get(mid) > b) {
                end = mid - 1;
            }

        }
        return start;
    }
}
