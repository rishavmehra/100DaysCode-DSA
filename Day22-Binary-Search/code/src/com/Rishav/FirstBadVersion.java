package com.Rishav;
//https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }
    static int firstBadVersion(int n) {
        int start=0;
        int end = n;
        int ans =-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(isBadVersion(mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return ans;

    }
}
