package com.Rishav;

public class PeakElement {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr,int n)
    {
        //gfg
        int peek=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                peek=i;
            }
        }
        return peek;
    }
}
