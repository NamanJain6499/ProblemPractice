package InterviewBitPractice.StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;
//solution
//https://www.youtube.com/watch?v=YwjDXWt2xHU
public class EvaluateExpression {
    public static void main(String args[]){
        EvaluateExpression evaluateExpression=new EvaluateExpression();
        ArrayList<String> A=new ArrayList<>();
        A.add("2");
        A.add("1");
        A.add("+");
        A.add("3");
        A.add("*");
        int answer=evaluateExpression.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<String> a) {
        Stack<Integer> st=new Stack<>();
        for (String token:a){
            if("+-*/".contains(token)){
                int y=st.pop();
                int x=st.pop();
                if (token.equals("+"))
                    st.push(x+y);
                else if (token.equals("-"))
                    st.push(x-y);
                else if (token.equals("*"))
                    st.push(x*y);
                else if (token.equals("/"))
                    st.push(x/y);

            }else {    //if token is number
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
