package com.Rishav;

import java.util.Scanner;

public class TilTheEnd {
    public static void main(String[] args) {
        /*Take integer inputs till the user enters 0 and print the sum
        of all numbers (HINT: while loop)*/
        int sum=0;
        int number=0;
        Scanner in= new Scanner(System.in);


        do{
            number=in.nextInt();
            sum = sum + number;
        }
        while(number!=0);
            System.out.println("Sum="+sum);
    }
}
