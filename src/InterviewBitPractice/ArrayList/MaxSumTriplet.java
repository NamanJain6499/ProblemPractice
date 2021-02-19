package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MaxSumTriplet {
    //https://www.interviewbit.com/problems/maximum-sum-triplet/

    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(new Integer[]{22649, 27447, 23806, 15891, 6730, 24371, 15351, 15007, 31102, 24394, 3549, 19630, 12624, 24085}));
//        arrayList.add(2);
//        arrayList.add(5);
//        arrayList.add(3);
//        arrayList.add(1);
//        arrayList.add(4);
//        arrayList.add(9);

        MaxSumTriplet maxSumTriplet = new MaxSumTriplet();
        int answer = maxSumTriplet.solve(arrayList);
        System.out.println(answer);
    }


    public int solve(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        int max[] = new int[n];
        int small[] = new int[n];
        max[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            max[i] = Math.max(arrayList.get(i + 1), max[i + 1]);
        }
        TreeSet<Integer> mm = new TreeSet<>();
        small[0] = 0;
        for (int j = 1; j < n; j++) {
            mm.add(arrayList.get(j - 1));
            Integer lower = mm.lower(arrayList.get(j));
            if (lower == null)
                small[j] = 0;
            else
                small[j] = lower;
        }
        int ans = 0;
        int answer[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (small[i] == 0 || max[i] <= arrayList.get(i))
                continue;
            ans = Math.max(small[i] + arrayList.get(i) + max[i], ans);
        }
        return ans;
    }
}
