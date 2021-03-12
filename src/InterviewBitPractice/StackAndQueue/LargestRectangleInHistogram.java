package InterviewBitPractice.StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;
//solution
//https://www.youtube.com/watch?v=0do2734xhnU
public class LargestRectangleInHistogram {
    public static void main(String args[]){
        LargestRectangleInHistogram rectangle=new LargestRectangleInHistogram();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(5);
        A.add(6);
        A.add(2);
        A.add(3);
        int area=rectangle.largestRectangleArea(A);
        System.out.println(area);
    }

    private int largestRectangleArea(ArrayList<Integer> A) {
        int[] rb=new int[A.size()];  //rb represent right boundary
        Stack<Integer> st=new Stack<Integer>();
        st.push(A.size()-1);
        rb[A.size()-1]=A.size();  ///we are inserting index in stack

        for (int i=A.size()-2;i>=0;i--){
            while (st.size()>0 && A.get(i)<=A.get(st.peek())){  //jab tak current element ka bar chota ha means till A.get(i)<=A.get(st.peek()) means
                st.pop();                                        // right wale bar bade ha and and right boundary is upto that
            }
            if (st.size()==0){
                rb[i]=A.size();  //pop karte karte is stack is empty then right ke sare bar bade h and right boundary is A.size
            }
            else {
                rb[i]=st.peek();   //jis index pe right bar chota ho jaiga current se then that will be right boundary and
                                    // we are storing index in stack so this peek give that index
            }
            st.push(i);
        }
    //creating left boundary
        int[] lb=new int[A.size()];
        Stack<Integer> s=new Stack<>();
        s.push(0);
        lb[0]=-1;  ///we are inserting index in stack

        for (int i=1;i<A.size();i++){
            while (s.size()>0 && A.get(i)<=A.get(s.peek())){
                s.pop();
            }
            if (s.size()==0){
                lb[i]=-1;
            }
            else {
                lb[i]=s.peek();
            }
            s.push(i);
        }
        int maxArea=0;
        for (int i=0;i<A.size();i++){
            int width=rb[i]-lb[i]-1;
            int area=width*A.get(i);
            if (area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;

    }
}
