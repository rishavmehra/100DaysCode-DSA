package com.Rishav;
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println("Welcome in Java program to find the largest and smallest of three numbers");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number :");
        int num1 = in.nextInt();
        System.out.println("Please enter the Second number :");
        int num2 = in.nextInt();
        System.out.println("Please enter the Third number :");
        int num3 = in.nextInt();
        largestnumber(num1, num2, num3);
        smallestnumber(num1, num2, num3);
    }
    static void largestnumber(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest of three numbers "+num1+", "+num2+ " and" +num3+ " is: "+num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest of three numbers "+num1+", "+num2+ " and" +num3+ " is: "+num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Largest of three numbers "+num1+", "+num2+ " and" +num3+ " is: "+num3);
        }
    }
    static void smallestnumber(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest of three numbers "+num1+", "+num2+ " and" +num3+ " is: "+num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Smallest of three numbers "+num1+", "+num2+ " and" +num3+ " is: "+num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("Smallest of three numbers "+num1+", "+num2+ " and" +num3+ " is: " +num3);
        }
    }
}
