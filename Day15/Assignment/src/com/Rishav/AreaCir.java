package com.Rishav;

import java.util.Scanner;

public class AreaCir {

    public static void main(String[] args) {
	// Area Of Circle Java Program
    float pi = 3.14159f;
        System.out.println("Enter radius");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        float A=pi*(r*r);
        System.out.println("Answer is: "+A);
    }
}
