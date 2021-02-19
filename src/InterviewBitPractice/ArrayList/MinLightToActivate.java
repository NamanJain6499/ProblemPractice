package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class MinLightToActivate {
    //https://www.interviewbit.com/problems/minimum-lights-to-activate/
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(1);
        int B = 3;
        MinLightToActivate minLightToActivate = new MinLightToActivate();
        int answer = minLightToActivate.solve(arrayList, B);
        System.out.println(answer);
    }


    public int solve(ArrayList<Integer> A, int B) {
        int size = A.size();
        // Handle corner case at first
        if (size == 1) {
            if (A.get(0) == 1)
                return 1;
            return -1;
        }
        int nextNonLit = 0;
        // total bulbs that need to be lit up
        int count = 0;
        while (nextNonLit < size) {
            int left = -1;
            int right = -1;

            // find the left most bulb that can be activated to lit up current non lit
            for (int i = 0; i < B; i++) {
                if (nextNonLit - i < 0)
                    continue;
                if (A.get(nextNonLit - i) == 1) {
                    left = nextNonLit - i;
                    break;
                }
            }

            // find the right most bulb that can be activated to lit up current non lit
            for (int i = B - 1; i >= 0; i--) {
                if (nextNonLit + i >= size)
                    continue;
                if (A.get(nextNonLit + i) == 1) {
                    left = nextNonLit + i;
                    break;
                }
            }
            // if neither left nor right found, we can not lit the current position
            // hence return -1
            if (left == -1 && right == -1) {
                return -1;
            }
            // try to light up the right first because left positions are already lit
            else if (left == -1) {
                nextNonLit = right + B;
            }
            // else light up the left side one
            else {
                nextNonLit = left + B;
            }
            // increment the count as one bulb is lit
            count++;
        }
        return count;
    }
}

