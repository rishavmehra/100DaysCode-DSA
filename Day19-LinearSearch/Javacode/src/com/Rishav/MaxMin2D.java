package com.Rishav;
import java.util.Arrays;
public class MaxMin2D {
    public static void main(String[] args) {

        int[][] arr ={
                {23, 4, 1},
                {18, 122, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int ans = Max(arr);
        System.out.println(ans);
    }

    static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int Min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
