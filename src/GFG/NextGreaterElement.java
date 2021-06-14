package GFG;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr={6 ,8, 0, 1, 3};
        long []answer=solve(arr,arr.length);
        for (int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }

    }

    private static long[] solve(long[] arr, int n) {
        long []res=new long [n];
        Stack<Long> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.size()==0){
                res[i]=-1;
            }else if(st.peek()>arr[i] && st.size()>0){
                res[i]=st.peek();
            }else if(st.peek()<=arr[i] && st.size()>0){
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()>0){
                    res[i]=st.peek();
                }else{
                    res[i]=-1;
                }
            }
            st.push(arr[i]);
        }
        return res;
    }
}
