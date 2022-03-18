package com.Rishav;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6};
        System.out.println(countRotation(arr));
    }

    private static int countRotation(int[] arr) {
        int pivot = findPvoit(arr);
         if(pivot==-1){
             //array is not rotated
             return 0;
         }
         return pivot+1;
    }


    //for no-duplicates
    static int findPvoit(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // 4 case over here
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid -1;
            }else {
                start = mid+1;
            }

        }
        return -1;
    }


    //use for dulplicates
    static int findPvoitWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // 4 case over here
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if element at middle, start, end are equal then just skip the dulicate
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the dulicate
                //NOte : if these element  at start  and end were the pivots??
                //check if start is povit
                if (arr[start] >arr[start+1]){
                    return start;
                }

                start++;
                /*
                 wheather end is pivot
                {4,5,6,7,0,1,2}
                */
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            }
            //left side is sorted, so pivot should be  in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]> arr[end]){
                start = mid +1;
            }else {
                end= mid -1;
            }

        }
        return -1;
    }

}
