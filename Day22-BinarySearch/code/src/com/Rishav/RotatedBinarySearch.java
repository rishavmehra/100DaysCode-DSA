package com.Rishav;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPvoit(arr));

    }

    public int search(int[] nums, int target) {
        int pivot =findPvoit(nums);
        //if you don't find the pivot, it mean array not rotated

        if(pivot== -1){
            //just do binary search
            int binarysarch = binarysearch(nums, target, 0, nums.length-1);
            return binarysarch;
        }
        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);

    }


     static int binarysearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
    //this will not work in dulplicate values

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
