package HackerRank;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int n=5;
        int []arr={10,3,5,6,2};
        long []ans=solve(arr,n);
        System.out.println(ans);
    }

    private static long[] solve(int[] nums, int n) {
        long []product=new long[n];
        product[0]=1;
        for(int i=1;i<n;i++){
            product[i]=product[i-1]*nums[i-1];
        }
        long R=1;
        for(int j=n-1;j>=0;j--){
            product[j]=product[j]*R;
            R=R*nums[j];
        }

        return product;
    }
}
