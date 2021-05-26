package InterviewBitPractice.DynamicProgramming;

import java.util.ArrayList;
//solution
//https://www.youtube.com/watch?v=jdfpGSSyN2I

//must solve question
public class LengthOfLongestSubsequence {
    public static void main(String[] args) {
        LengthOfLongestSubsequence bitonic = new LengthOfLongestSubsequence();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(11);
        A.add(2);
        A.add(10);
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(1);
        int longest = bitonic.bitonicSequence(A);
        System.out.println(longest);
    }

    private int bitonicSequence(ArrayList<Integer> A) {
        int n = A.size();
        //lis represent longest increasing subsequence
        int[] lis = new int[n];
        int omax = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (A.get(j) < A.get(i)) {
                    if (lis[j] > max) {
                        max = lis[j];
                    }
                }
            }
            lis[i] = max + 1;
        }

        //lds represent longest decreasing subsequence
        int[] lds = new int[n];
        for (int i = A.size() - 1; i >= 0; i--) {
            int max = 0;
            for (int j = A.size() - 1; j > i; j--) {
                if (A.get(j) < A.get(i)) {
                    if (lds[j] > max) {
                        max = lds[j];
                    }
                }
            }
            lds[i] = max + 1;
        }

        for (int i = 0; i < A.size(); i++) {
            if (lis[i] + lds[i] - 1 > omax) {
                omax = lis[i] + lds[i] - 1;
            }
        }


        return omax;
    }
}
