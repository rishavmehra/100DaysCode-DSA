package com.Rishav;

public class RunnigSumof1DArray1480 {
    public int[] runningSum(int[] nums) {
        int[] size = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            size[i]=sum;
        }
        return size;
    }
}
