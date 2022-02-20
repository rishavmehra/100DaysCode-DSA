package com.Rishav;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(334, 434, 34, 4, 34, 3, 4, 3, 43, 4);
    }
        static void fun(int...v){
            System.out.println(Arrays.toString(v));
        }
}
