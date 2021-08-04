package GFG;

public class GeekCollectsTheBalls {
    public static void main(String[] args) {
        int N = 5, M = 5;
        int a[] = {1, 4, 5, 6, 8};
        int b[] = {2, 3, 4, 6, 9};
        int answers=maxBalls(N,M,a,b);
        System.out.println(answers);
    }

    private static int maxBalls(int N, int M, int[] a, int[] b) {
        int aSum=0;
        int bSum=0;
        int ans=0;
        int i=0,j=0;
        while(i<N && j<M){
            while(i+1<N && a[i]==a[i+1]){
                aSum+=a[i];
                i++;
            }
            while(j+1<M && b[j]==b[j+1]){
                bSum+=b[j];
                j++;
            }
            if(a[i]==b[j]){
                ans+=Math.max(aSum,bSum) +a[i];
                aSum=0;
                bSum=0;
                i++;
                j++;
            }else if(a[i]<b[j]){
                aSum+=a[i];
                i++;
            } else {
                bSum+=b[j];
                j++;
            }
        }
        while(i<N){
            aSum+=a[i];
            i++;
        }
        while(j<M){
            bSum+=b[j];
            j++;
        }
        ans=Math.max(aSum,bSum) + ans;
        return ans;
    }
}
