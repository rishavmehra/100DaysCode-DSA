package com.Rishav;


import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID=in.nextInt();
        String departmanet=in.next();

        switch (empID) {
            case 1 -> System.out.println("Rishu");
            case 2 -> System.out.println("Rahul");
            case 3 -> {
                System.out.println("emp number 3");
                switch (departmanet) {
                    case "IT" -> System.out.println("IT departmant");
                    case "Managment" -> System.out.println("Management departmanet ");
                    default -> System.out.println("not departmant");
                }
            }
            default -> System.out.println("Wrong input");
        }

    }
}
