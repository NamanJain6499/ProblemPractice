package InterviewBitPractice.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;

//solution and explanation
//https://www.youtube.com/watch?v=GqE96uMPOLI
public class LetterPhone {
    public static void main(String args[]) {
        LetterPhone letterPhone = new LetterPhone();
        String A = "23";
        ArrayList<String> answer = letterPhone.letterCombinations(A);
        System.out.println(answer);
    }

    public ArrayList<String> letterCombinations(String digit) {
        ArrayList<String> ans = new ArrayList<String>();
        if (digit.length() == 0) {
            return ans;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('0', "0");
        map.put('1', "1");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(digit, 0, map, new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(String digit, int start, HashMap<Character, String> map, StringBuilder sb, ArrayList<String> ans) {
        //if the length of stringbuilder i.e. sb equals to digit len than that is one combination we want and
        // add that tp ans and return and remove last element from sb.
        if (sb.length() == digit.length()) {
            ans.add(sb.toString());
            return;
        }
        //if we are at some digit then curr store the string mapped to that digit
        String curr = map.get(digit.charAt(start));
        for (int i = 0; i < curr.length(); i++) {
            sb.append(curr.charAt(i));//now we add first  character of curr to sb
            backtrack(digit, start + 1, map, sb, ans);//now we move to next digit by passing start+1 as next start index and later add that to sb
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
