package com.Rishav;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the diagonal : ");
        float diagonal=in.nextFloat();
        System.out.println("Enter the Another diagonal : ");
        float diagonal1= in.nextFloat();
        float Area= diagonal1*diagonal/2;
        System.out.println("Result: "+Area);
    }
}
