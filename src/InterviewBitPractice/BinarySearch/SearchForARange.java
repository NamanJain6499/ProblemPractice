package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;

public class SearchForARange {
    public static void main(String arggs[]) {
        SearchForARange search = new SearchForARange();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
//        A.add(17);
//        A.add(7);
//        A.add(18);
//        A.add(8);
//        A.add(10);
        int B = 5;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer = search.solve(A, B);
        System.out.println(answer);
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int start = 0;
        int end = n - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (start <= end) {
            int mid = (start + end) / 2;
            int stPos = -1;
            int enPos = -1;
            if (A.get(mid) == B) {
                int k = mid;
                while (k - 1 >= 0 && A.get(k - 1) == B) {
                    k--;
                }
                stPos = k;
                k = mid;
                while (k + 1 <= end && A.get(k + 1) == B) {
                    k++;
                }
                enPos = k;
                ans.add(0, stPos);
                ans.add(1, enPos);
                break;
            } else if (A.get(mid) > B) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        if (ans.isEmpty()) {
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
}
