package com.Rishav;

import java.util.Scanner;

public class AreaTri {
    public static void main(String[] args) {
        //Area Of Triangle
        System.out.println("Enter the Base of triangle: ");
        Scanner in = new Scanner(System.in);
        float base=in.nextFloat();
        System.out.println("Enter the height of triangle: ");
        float height= in.nextFloat();
        float Area= height*base/2;
        System.out.println("Result: "+Area);

    }
}
