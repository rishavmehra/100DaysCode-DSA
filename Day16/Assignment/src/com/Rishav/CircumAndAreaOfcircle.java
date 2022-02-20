package com.Rishav;

import java.util.Scanner;

public class CircumAndAreaOfcircle {
    static float pi=3.14159f;
    public static void main(String[] args) {
        //  Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        float r = in.nextFloat();

        System.out.println("Area of circle is: "+area(r));
        System.out.println("circumference of circle is: "+cicum(r));


    }

    static float area(float r) {
        // formula pi*r*r
        return pi*r*r;
    }

    static  float cicum(float r){
        // formula 2*pi*r
        float rishu = 2 * pi * r;
        return rishu;
    }

}
