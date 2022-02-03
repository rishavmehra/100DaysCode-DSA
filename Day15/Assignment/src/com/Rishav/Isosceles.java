package com.Rishav;

import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        //Area Of Isosceles Triangle
        System.out.println("Enter base: ");
        Scanner in =new Scanner(System.in);
        float base= in.nextFloat();
        System.out.println("Enter height: ");
        float height= in.nextFloat();
        float iso=height*base/2;
        System.out.println("Result: "+iso);
    }
}
