package com.Rishav;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        //Take input from user, and store it in the variable 'num'
        int num,i;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for (i = 1; i <=num; i++) {
            if (num % i == 0){
                System.out.println(" "+i);
            }
        }

    }
}
