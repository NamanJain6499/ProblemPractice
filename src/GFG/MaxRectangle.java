package GFG;

import java.util.Stack;

public class MaxRectangle {
    public static void main(String[] args) {

//        2 8
//0 0 1 0 0 0 0 0 1 1 1 1 1 1 1 0
        int n = 2;
        int m = 8;
        int[][] M = {{0 ,0 ,1, 0, 0, 0, 0, 0},
                {1 ,1 ,1 ,1 ,1 ,1 ,1 ,0}};
        MaxRectangle maxRectangle=new MaxRectangle();
        int answer=maxRectangle.maxArea(M,m,n);
        System.out.println(answer);

    }

    private int maxArea(int[][] M, int m, int n) {
        int output[]=new int[m];
        for(int k=0;k<m;k++){
            output[k]=M[0][k];
        }
        int max=maxAreaHistogram(output);
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==0){
                    output[j]=0;
                }
                else{
                    output[j]=output[j]+M[i][j];
                }
            }
            max=Math.max(max,maxAreaHistogram(output));
        }
        return max;
    }

    private int maxAreaHistogram(int[] arr) {
        int len=arr.length;
        int right[]=new int[len];
        int left[]=new int[len];
        right=NSR(arr);
        left=NSL(arr);
        int area[]=new int[len];
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            area[i]=arr[i]*(right[i]-left[i]-1);
        }
        for (int j=0;j<area.length;j++){
            maxArea=Math.max(maxArea,area[j]);
        }
        return maxArea;
    }

    private int[] NSL(int[] arr) {
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

    private int[] NSR(int[] arr) {
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
