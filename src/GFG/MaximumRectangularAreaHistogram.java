package GFG;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangularAreaHistogram {
    public static void main(String[] args) {
        MaximumRectangularAreaHistogram area=new MaximumRectangularAreaHistogram();
        long []arr={6,2,5,4,5,1,6};
        long n=7;
        long answer=area.getMaxArea(arr,n);
        System.out.println(answer);
    }

    private long getMaxArea(long[] arr, long n) {
        int left[]=new int[(int) n];
        int rigth[]=new int[(int) n];
        left=nearestSmallestLeft(arr);
        rigth=nearestSmallestRight(arr);
        long area[]=new long[(int) n];
        for(int i=0;i<n;i++){
           int width=(rigth[i]-left[i]-1);
           area[i]=width*arr[i];
        }
        long max=Integer.MIN_VALUE;
        for (int j=0;j<area.length;j++){
            max=Math.max(max,area[j]);
        }
        return max;
    }

    private int[] nearestSmallestLeft(long[] arr) {
        Stack<pair<Integer,Integer>> st=new Stack<>();
        int res[]=new int[arr.length];
        int pseudoIndex=-1;
        for (int i=0;i<arr.length;i++){
            if(st.size()==0){
                res[i]=pseudoIndex;
            }else if (st.size()>0 && st.peek().element<arr[i]){
                res[i]=st.peek().index;
            }else if(st.size()>0 && st.peek().element>=arr[i]){
                while (st.size()>0 && st.peek().element>=arr[i]){
                    st.pop();
                }
                if (st.size()==0){
                    res[i]=pseudoIndex;
                }else {
                    res[i]=st.peek().index;
                }
            }
            pair p=new pair((int) arr[i],i);
            st.push(p);
        }
        return res;
    }

    private int[] nearestSmallestRight(long[] arr) {
        Stack<pair<Integer,Integer>> st=new Stack<>();
        int res[]=new int[arr.length];
        int pseudoIndex=arr.length;
        for (int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                res[i]=pseudoIndex;
            }else if (st.size()>0 && st.peek().element<arr[i]){
                res[i]=st.peek().index;
            }else if(st.size()>0 && st.peek().element>=arr[i]){
                while (st.size()>0 && st.peek().element>=arr[i]){
                    st.pop();
                }
                if (st.size()==0){
                    res[i]=pseudoIndex;
                }else {
                    res[i]=st.peek().index;
                }
            }
            pair p=new pair((int) arr[i],i);
            st.push(p);
            }
        return res;
        }
    }



    class pair<T, T1> {
        Integer element;
        int index;

        public pair(int element, int index) {
            this.element = element;
            this.index = index;
        }
}
