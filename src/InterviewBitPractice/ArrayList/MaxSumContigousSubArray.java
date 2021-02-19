package InterviewBitPractice.ArrayList;

import java.util.ArrayList;


public class MaxSumContigousSubArray {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-2);
        arrayList.add(1);
        arrayList.add(-3);
        arrayList.add(4);
        arrayList.add(-1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(-5);
        arrayList.add(4);
        MaxSumContigousSubArray maxSumContigousSubArray = new MaxSumContigousSubArray();
        int sum = maxSumContigousSubArray.maxSubArray(arrayList);
        System.out.println(sum);

    }

    int maxSubArray(ArrayList<Integer> arrayList) {
        int max_so_far = arrayList.get(0);
        int cur_max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            cur_max = Math.max(arrayList.get(i), cur_max + arrayList.get(i));
            max_so_far = Math.max(max_so_far, cur_max);
        }
        return max_so_far;
    }
}
