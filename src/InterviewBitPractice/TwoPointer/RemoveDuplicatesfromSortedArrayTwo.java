package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArrayTwo {
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayTwo two = new RemoveDuplicatesfromSortedArrayTwo();
        ArrayList<Integer> A = new ArrayList<>();
        //A: [1000, 1000, 1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010 ]
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);

        A.add(1);


        A.add(2);

        A.add(3);
        A.add(3);

        A.add(4);
        A.add(5);
        // A : [ 0, 1, 1, 2, 2, 3, 3, 3, 3 ]

        int ans = two.solve(A);
        System.out.println(ans);

    }

    private int solve(ArrayList<Integer> nums) {
        int i = 0;
        for (int j = 1; j < nums.size(); j++) {
            if (!nums.get(j).equals(nums.get(i))) {
                i = i + 2;
                int k=remove(nums, i, j - 1,j);
                j=k;
            }

        }
        while (nums.size() > i + 2) {
            nums.remove(nums.size() - 1);
        }
        return nums.size();
    }

    private int remove(ArrayList<Integer> nums, int start, int end,int j) {
        int removeTimes = end - start + 1;
        while (start<=end&&removeTimes-- > 0) {
            nums.remove(start);
            j--;
        }
        return j;
    }
}
