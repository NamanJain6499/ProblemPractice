package InterviewBitPractice.Strings;

import java.util.ArrayList;

public class IntersectionSortedArray {
    public static void main(String[] args) {
        IntersectionSortedArray intersection = new IntersectionSortedArray();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(3);
        B.add(3);
        B.add(5);
        B.add(1000000);
        ArrayList<Integer> answer = intersection.solve(A, B);
        System.out.println(answer);
    }

    private ArrayList<Integer> solve(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                i++;
            } else if (a.get(i) > b.get(j)) {
                j++;
            } else {
                res.add(a.get(i));
                i++;
                j++;
            }
        }
        return res;
    }
}
