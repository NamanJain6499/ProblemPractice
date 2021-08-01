package GFG;

public class PreorderTraversalBST {
    public static void main(String[] args) {
        PreorderTraversalBST preorderTraversalBST=new PreorderTraversalBST();
        int [] A=new int[]{12,12,5};
        int N=3;
        int answer=preorderTraversalBST.solve(A,N);
        System.out.println(answer);
    }

    private int solve(int[] arr, int N) {
        int index=0;
        for(int i=1;i<N;i++){
            if(arr[i]>arr[0]){
                index=i;
            }
        }
        for(int j=index+1;j<N;j++){
            if(arr[j]<arr[0]){
                return 0;
            }
        }
        return 1;
    }
}
