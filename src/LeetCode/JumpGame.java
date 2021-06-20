package LeetCode;

public class JumpGame {
    public static void main(String[] args) {
        int nums[]={3,2,1,0,4};
            int n=nums.length;
            int reach=0;
            for(int i=0;i<=reach;i++){
                reach=Math.max(reach,nums[i]+i);
                if(reach>=n-1){
                    System.out.println("true");
                }
            }

            System.out.println("false");
    }
}