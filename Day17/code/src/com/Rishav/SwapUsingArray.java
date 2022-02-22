package com.Rishav;

import java.util.Arrays;

public class SwapUsingArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(Arrays.toString(arr));
        System.out.println("Swaped value or reverse value");
//        swap(arr,0,4);

//        System.out.println(Arrays.toString(arr));
//
    reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end );
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
