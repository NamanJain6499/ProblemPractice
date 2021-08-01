package LeetCode;

public class ThreeEqualParts {
    public static void main(String[] args) {
        int arr[]=new int[]{1,0,1,0,1};
        ThreeEqualParts threeEqualParts=new ThreeEqualParts();
        int answer[]=threeEqualParts.solve(arr);
        for(int i=0;i<2;i++){
            System.out.print(answer[i]+ " ");
        }

    }

    private int[] solve(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int ans[]=new int[2];

        if(sum%3!=0){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        ans[0]=-1;
        ans[1]=-1;
        int temp_sum=0;
        int i=0;
        while(i<n){
            temp_sum +=arr[i];
            if(temp_sum==sum/3 && ans[0]==-1){
                ans[0]=i;

            }
            if(temp_sum==2*(sum/3) && ans[1]==-1){
                ans[1]=i+1;
                break;
            }
            i++;
        }
        return ans;
    }
}
