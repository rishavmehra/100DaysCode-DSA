package com.Rishav;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        //Area Of Parallelogram
        System.out.println("Enter base: ");
        Scanner in =new Scanner(System.in);
        float Base= in.nextFloat();
        System.out.println("Enter height: ");
        float height= in.nextFloat();
        float parallelogram=height*Base;
        System.out.println("Result: "+parallelogram);
    }
}
