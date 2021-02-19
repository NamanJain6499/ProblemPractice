package InterviewBitPractice.Strings;

import java.util.Stack;

//https://www.geeksforgeeks.org/minimum-number-of-parentheses-to-be-added-to-make-it-valid/
public class MinimumParentheses {
    public static void main(String args[]) {
        MinimumParentheses parentheses = new MinimumParentheses();
        String A = "()))((";
        int answer = MinimumParentheses.solve(A);
        System.out.println(answer);
    }

    private static int solve(String A) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for(int i = 0; i < A.length(); i++){

            if(A.charAt(i) == '(')
                s.push('(');
            else if(A.charAt(i) == ')' && s.size() > 0){
                s.pop();
            }
            else
                count++;
        }

        return s.size() + count;
    }
}
