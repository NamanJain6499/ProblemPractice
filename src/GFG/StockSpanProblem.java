package GFG;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {

//        Input:
//        N = 7, price[] = [100 80 60 70 60 75 85]
//        Output:
//        1 1 1 2 1 4 6

        int[]arr={100,80,60,70,60,75,85};
        int []answer=solve(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(answer[i]);
        }
    }

    private static int[] solve(int[] arr) {
        Stack<pair<Integer, Integer>> stack=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(stack.size()==0){
                ans[i]=-1;
            }else if(stack.size()>0 && stack.peek().element>arr[i]) {
                ans[i] = stack.peek().index;
            }else if(stack.size()>0 && stack.peek().element<=arr[i]){
                while(stack.size()>0 && stack.peek().element<=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    ans[i]=-1;
                }else{
                    ans[i]=stack.peek().index;
                }
            }
            pair<Integer,Integer> p=new pair<>(arr[i],i);
            stack.push(p);

        }
        for (int j=0;j<ans.length;j++){
            ans[j]=j-ans[j];
        }
        return ans;
    }


        private static class pair<T, T1> {
            Integer element;
            int index;

            public pair(int element, int index) {
                this.element = element;
                this.index = index;
            }
        }
}
