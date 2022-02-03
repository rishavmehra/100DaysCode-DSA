package com.Rishav;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int i=1;
        int fact=1;
        while(i<=number){
            fact = fact *i;
            i++;
        }
        System.out.println(fact);
    }
}
