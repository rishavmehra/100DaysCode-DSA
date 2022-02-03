package com.Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter Principle: ");
        Scanner P = new Scanner(System.in);
        System.out.println("Enter Rate: ");
        Scanner R = new Scanner(System.in);
        System.out.println("Enter Time: ");
        Scanner T = new Scanner(System.in);
        float num1 = P.nextInt();
        float num2 = R.nextInt();
        float num3 = T.nextInt();

        float result= (num1*num2*num3)/100;
        System.out.println("Your Answer is: "+result);

    }
}
