package InterviewBitPractice.checkpoint;

import java.util.Stack;

public class GenerateallParentheses {
    public static void main(String args[]){
        GenerateallParentheses parentheses=new GenerateallParentheses();
        String str="[{}()]";
        int answer=parentheses.solve(str);
        System.out.println(answer);
    }

    private int solve(String str) {
        Stack<Character> st=new Stack<>();
        int n=str.length();
        st.push(str.charAt(0));
        for (int i=1;i<n;i++){
            char c=str.charAt(i);
            if (st.size()>0&& c=='('||c=='{'||c=='['){
                st.push(c);
            }else if(st.size()>0&&c==')'&&st.peek()=='('){
                st.pop();
            }
            else if(st.size()>0&&c=='}'&&st.peek()=='{') {
                st.pop();
            }
            else if (st.size()>0&&c==']'&&st.peek()=='['){
                st.pop();
            }else {
                return 0;
            }
        }
        if (st.isEmpty()){
            return 1;
        }
        return 0;

    }
}
