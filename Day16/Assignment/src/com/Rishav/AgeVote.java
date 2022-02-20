package com.Rishav;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AgeVote {
    public static void main(String[] args) {
        System.out.println("A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.");
        Scanner in = new Scanner(System.in);
        System.out.print("please Enter your Age: ");
        int age = in.nextInt();
        System.out.println(agevote(age));
    }

    static String agevote(int age) {
        if (age>=18){
            return "you are eliglible to Vote";
        }else {
            return "you are not eliglible to Vote";
        }
    }


}
