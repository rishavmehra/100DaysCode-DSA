package com.Rishu;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("convert celsius into fahrenheit: ");
        float tempc = temp.nextInt();
        float tempf = (tempc*9/5)+32;
        System.out.println(tempf);
    }
}
