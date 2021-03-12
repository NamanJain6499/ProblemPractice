package InterviewBitPractice.StackAndQueue;

import java.util.Stack;
//solution
//https://www.youtube.com/watch?v=TsaJeijtKZM
public class RedundantBraces {
    public static void main(String args[]){
        String A="((a + b))";
        RedundantBraces redundantBraces=new RedundantBraces();
        int answer=redundantBraces.braces(A);
        System.out.println(answer);
    }

    //if there is some operation in between two brackets then it is non redundant
    // but if written like  A=="(a)" then no operation between brackets then it is redundant
    private int braces(String A) {
        Stack<Character> st=new Stack<>();
        int n=A.length();
        for (int i=0;i<n;i++){
            char symbol=A.charAt(i);
            if (symbol=='(' ||symbol=='+'||symbol=='-'||symbol=='*'||symbol=='/'){
                st.push(symbol);
            }else if (symbol==')'){
                char ch=st.pop();
                if (ch=='('){
                    return 1;
                }
                st.pop();
            }
            else {
                //do nothing if there is any alphabet in string
            }
        }
        return 0;
    }
}
