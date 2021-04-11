package InterviewBitPractice.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class MaximalString {
    public static void main(String args[]) {
        MaximalString string = new MaximalString();
        String A = "75599";
        int B = 2;
        String answer = string.solve(A, B);
        System.out.println(answer);
    }

    public String solve(String A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            //now after subtracting 0 from character of A we get integer
            arr.add(A.charAt(i) - '0');
        }
        Collections.sort(arr);
        int j = arr.size() - 1;
       // String res="";
        for (int i = 0; i < B; i++) {
            int element = arr.get(j);
            A = swap(A.toCharArray(), i, A.indexOf(element+'0'));
            j--;
        }
        return A;

    }

    private String swap(char[] A, int i, int i1) {
        char temp = A[i];
        A[i] = A[i1];
        A[i1] = temp;
        String str = String.valueOf(A);
        return str;
    }
}
