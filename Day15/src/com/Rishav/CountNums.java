package com.Rishav;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        System.out.println("Number: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Number that you want to find: ");
        Scanner in2 = new Scanner(System.in);



        int n=in.nextInt();
        int number = in2.nextInt();
        int count=0;
        while (n>0){
            int rem=n%10;
            if (rem==number){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}


