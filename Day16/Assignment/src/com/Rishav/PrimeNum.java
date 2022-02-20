package com.Rishav;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        //Define a method to find out if a number is prime or not.

        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        System.out.println(primenum(num));

    }

    static boolean primenum(int num) {
        if (num<=1)
            return false;
        for (int i = 2; i <num ; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
