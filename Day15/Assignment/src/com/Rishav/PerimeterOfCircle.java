package com.Rishav;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        float pi = 3.14159f;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter radius");
        float r = in.nextFloat();
        float C= 2*pi*r;
        System.out.println("Result: "+Math.round(C));

    }
}
