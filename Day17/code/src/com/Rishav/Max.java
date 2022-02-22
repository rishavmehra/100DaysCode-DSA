package com.Rishav;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23888,9,18};
        System.out.println(max(arr));
    }
        // image that arr is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length ; i++) {
                maxVal = arr[i];
        }
        return maxVal;
    }


}
