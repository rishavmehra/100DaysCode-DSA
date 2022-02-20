package com.Rishav;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Find out whether a given number is even or odd.");
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = in.nextInt();
        System.out.println(OddEven(num));
    }

    static String OddEven(int number){
        if(number%2==0) {
            return "number is even";
        }else {
            return "number is Odd";
        }

    }

}
