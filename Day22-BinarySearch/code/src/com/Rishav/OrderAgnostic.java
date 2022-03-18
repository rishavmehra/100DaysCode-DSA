package com.Rishav;

public class OrderAgnostic {
    // Find whether the array is shorted in ascending or descending
    public static void main(String[] args) {
        int[] arr =  new int[]{9,8,7,6,5,4,3,2,1};
        int target = 4;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }


    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


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
