package com.Rishav;

import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 7, 8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
