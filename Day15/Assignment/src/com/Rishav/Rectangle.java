package com.Rishav;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // Area Of Rectangle Program
        System.out.println("Enter Lenght: ");
        Scanner in =new Scanner(System.in);
        float len= in.nextFloat();
        System.out.println("Enter width: ");
        float width= in.nextFloat();
        float rectangle=width*len;
        System.out.println("Result: "+rectangle);
    }
}
