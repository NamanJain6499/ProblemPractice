package InterviewBitPractice.StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;
//solution
//https://www.youtube.com/watch?v=_mqdqUfvsMI&t=660s
public class NearestSmallerElement {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(10);
        A.add(8);
        NearestSmallerElement nearestSmallerElement=new NearestSmallerElement();
        ArrayList<Integer> answer=nearestSmallerElement.prevSmaller(A);
        System.out.println(answer);
    }

    private ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> st=new Stack<>();
        st.push(A.get(0));
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(-1);
        for (int i=1;i<A.size();i++){
            while (!st.isEmpty() && A.get(i)<=st.peek()){
                st.pop();
            }
            if (st.isEmpty()){
                ans.add(-1);
            }else {
                ans.add(st.peek());
            }
            st.push(A.get(i));
        }
        return ans;
    }
}
