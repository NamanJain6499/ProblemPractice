package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum=new ThreeSum();
        int nums[]=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> answer=threeSum.solve(nums);
        System.out.println(answer);
    }

    private List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    List<Integer> ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);
                    res.add(ans);
                    l++;
                    r--;

                }
                else if(sum>0){
                    r--;
                }
                else{
                    l++;
                }

            }

        }
        return res;
    }
}
