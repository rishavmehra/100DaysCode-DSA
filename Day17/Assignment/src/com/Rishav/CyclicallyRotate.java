package com.Rishav;

public class CyclicallyRotate {

    public void rotate(int arr[], int n)
    {
        int len=n-1;
        int x = arr[len];
        for(int i=len; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;

    }
}

/*
Given an array, rotate the array by one position in clock-wise direction.


Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4*/