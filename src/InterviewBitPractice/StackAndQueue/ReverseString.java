package InterviewBitPractice.StackAndQueue;

import java.util.*;

public class ReverseString {
    public static void main(String args[]){
        String A="abc";
        ReverseString reverseString=new ReverseString();
        String answer=reverseString.reverse(A);
        System.out.println(answer);
    }

    private String reverse(String A) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            st.push(ch);
        }
        StringBuilder reverseString=new StringBuilder();
        for (int j=0;j<A.length();j++){
            reverseString.append(st.pop());
        }
        return reverseString.toString();
    }
}
