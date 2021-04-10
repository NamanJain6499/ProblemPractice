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
        if (s.length()==0){
            result.add(new ArrayList<String>(list));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String left = s.substring(0, i+1);
            String right = s.substring(i+1);
            if (isPalindrome(left)) {
                list.add(left);
                backtrack(right,list,result);
                list.remove(list.size()-1);
            }
        }
    }

    private boolean isPalindrome(String left) {
        int i=0;
        int j=left.length()-1;
        while (i<=j){
            if (left.charAt(i)!=left.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
