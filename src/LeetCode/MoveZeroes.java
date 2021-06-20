package LeetCode;

import java.util.ArrayList;

public class MoveZeroes {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        int n=nums.length;
        int lastNonZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[lastNonZero]=nums[i];
                lastNonZero++;
            }
        }
        for(int i=lastNonZero;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        }
    }

