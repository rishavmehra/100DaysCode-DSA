package com.Rishav;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = mygreet(naam);
        System.out.println(personalised);

    }

    static String mygreet(String name) {
        String message = "hello " + name;
        return message;
    }


    static String greet(){
        String greeting = "how are you";
        return greeting;

    }

}
