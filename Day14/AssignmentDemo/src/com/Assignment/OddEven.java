package com.Assignment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int num2 =num1.nextInt();
        if(num2 %2 == 0)
            System.out.println("number is Even");
        else
            System.out.println("Odd");


    }


}
