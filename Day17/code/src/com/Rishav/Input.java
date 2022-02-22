package com.Rishav;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 34;
//        arr[1] = 45;
//        arr[2] = 56;
//        arr[3] = 67;
//        arr[4] = 87;
//        System.out.println(arr[3]);

        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//            for (int j : arr) {
//                System.out.print(j + " ");

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
                str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}

