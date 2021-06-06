package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray remove=new RemoveDuplicatesFromSortedArray();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(5000);
        A.add(5000);
        A.add(5000);
        int answer=remove.removeDuplicates(A);
        System.out.println(answer);
        Integer[] a = new Integer[10];
    }

    private int removeDuplicates(ArrayList<Integer> a) {
        int i = 0;
        for (int j = 1; j < a.size(); j++) {
                if (a.get(i).intValue() != a.get(j).intValue())
                a.set(++i, a.get(j));
        }
        while (a.size() > i + 1)
            a.remove(a.size() - 1);

        return a.size();
    }
}
