package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class SearchInBitonicArray {
    public static void main(String args[]) {
        SearchInBitonicArray search = new SearchInBitonicArray();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(9);
        A.add(10);
        A.add(20);
        A.add(17);
        A.add(5);
        A.add(1);
        int B = 30;
        int index = search.solve(A, B);
        System.out.println(index);
    }

    private int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        Integer max = Collections.max(A);
        int maxIndex = A.indexOf(max);
        if (B > max)
            return -1;
        else if (B == max)
            return maxIndex;
        else {
            int start = 0, mid = maxIndex, end = n - 1;
            int searchLeft = leftsearch(A, start, mid - 1, B);
            if (searchLeft != -1) {
                return searchLeft;
            }
            int searchRight = reversesearch(A, mid, end, B);
            if (searchRight != -1) {
                return searchRight;
            } else
                return -1;
        }
    }

    public int leftsearch(ArrayList<Integer> A, int start, int end, int B) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) > B) {
                end = mid - 1;
            } else if (A.get(mid) == B) {
                return mid;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public int reversesearch(ArrayList<Integer> A, int start, int end, int B) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) > B) {
                start = mid + 1;
            } else if (A.get(mid) == B) {
                return mid;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
