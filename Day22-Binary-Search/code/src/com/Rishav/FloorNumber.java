package com.Rishav;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 32;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }
}