package InterviewBitPractice.Backtracking;

import java.util.ArrayList;

public class PalindromePartitioning {
    public static void main(String args[]) {
        PalindromePartitioning partitioning = new PalindromePartitioning();
        String s = "aab";
        ArrayList<ArrayList<String>> answer = partitioning.partion(s);
        System.out.println(answer);
    }

    private ArrayList<ArrayList<String>> partion(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if (s.length() == 0) {
            return result;
        }
        backtrack(s, new ArrayList<String>(), result);
        return result;
    }

    private void backtrack(String s, ArrayList<String> list, ArrayList<ArrayList<String>> result) {
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            if (isPalindrome(left)) {
                ArrayList<String> copylist = new ArrayList<>(list);
                copylist.add(left);
                backtrack(right,copylist,result);
            }
        }
    }

    private boolean isPalindrome(String left) {
        return true;
    }
}
