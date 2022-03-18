package com.Rishav;
// https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountain {
    public static void main(String[] args) {

    }

    int searc(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsthalf = orderAgnosticBS(arr, target, 0, peak);
        int secondhalf = orderAgnosticBS(arr,target,peak+1,arr.length-1);
        if (firsthalf!= -1){
            return firsthalf;
        }

        return secondhalf;
    }



    public int peakIndexInMountainArray(int[] arr) {
        //[0,10,5,2]

        int start=0;
        int end = arr.length-1;


        while (start<end){
            int mid =start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                // you are in decreasing part of the array
                // this may be the ans, but look at the left
                // this is why end != end - 1
                end = mid;
            }else {
                // you are in ascending part of the array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }

        }
        // in the end, start == end and pointing to the largest number in the array because of 2 checks
        // start and end are always trying to find the max element in the above 2 check
        // hence, when they are pointing to just one element, tht is the max one because that is what the checks says
        // more elaboration: at every point of time for start and end, they have best possible answer till that time
        // and if we are saying that only one item is remaining, hence because of above line that is the best possible answer
        return start;// or return end as both are same


    }


    static int orderAgnosticBS(int[] arr, int target,int start, int end){
        // Find whether the array is shorted in ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]) { //9<1
            isAsc = true;
        }else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}