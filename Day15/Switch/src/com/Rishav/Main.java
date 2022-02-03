package com.Rishav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        if (fruit.equals("Mango")){
//            System.out.println("King of Fruit");
//
//        }
//        if (fruit.equals("Apple")){
//            System.out.println("A sweet red fruit");
//        }

                // Switch

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("Sweet red fruit");
//            case "orange" -> System.out.println("round fruti");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please enter valid fruit");
//        }

        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesdays");
//            case 4 -> System.out.println("Thurssday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Satuary");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter valid Day");
//        }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter valid Day");
                break;
        }
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//            default -> System.out.println("Enter valid Day");
        }

        // USE ALT+Enter

//        if (day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesdays");
//        } else if (day == 4) {
//            System.out.println("Thurssday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else if (day == 6) {
//            System.out.println("Satuary");
//        } else if (day == 7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Enter valid Day");
//        }



    }

