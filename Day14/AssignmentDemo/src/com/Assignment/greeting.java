package com.Assignment;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner enter= new Scanner(System.in);
        String name=enter.next();

        System.out.println("Welcome "+name+" to my world:)");


    }
}
