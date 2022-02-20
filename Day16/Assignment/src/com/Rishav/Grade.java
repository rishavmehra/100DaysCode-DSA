package com.Rishav;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your marks: ");
        int marks = in.nextInt();
        System.out.println(grading(marks));

    }

    static String grading(int marks){
        if(marks>=91){
            return "Your Grade is: AA";
        }else if (marks>=81){
            return "Your Grade is: AB";
        }else if(marks>=71){
            return "Your Grade is: BB";
        }else if (marks>=61){
            return "Your Grade is: BC";
        }else if (marks>=51){
            return "Your Grade is: CD";
        }else if(marks>=41){
            return "Your Grade is: DD";
        }else
        return "Fail";
    }

}
