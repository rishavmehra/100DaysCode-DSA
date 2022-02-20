package com.Rishav;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  num = in.nextInt();
        System.out.println(fact(num));
    }

    static int fact(int num) {
        int i=1;
        int oth=1;
        if(num==0){
            return 1;
        }
        while(i<=num){
            oth=oth*i;
            i++;
        }
        return oth;
    }
}
