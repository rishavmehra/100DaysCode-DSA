package com.Rishav;

import java.util.Scanner;

public class Product {
    //Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args) {
        //Write a program to print the sum of two numbers entered by user by defining your own method.
        System.out.print("Enter two number: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2= in.nextInt();
        System.out.println("Answer is: "+product(num1,num2));

    }
    static int product(int n1, int n2){
        return n1*n2;
    }
}
