package com.Rishu;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();

        // type casting
//        int num = (int)(4545.454f);
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int a=257;
//        byte b=(byte)(a);
//        System.out.println(b);

//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=a*b/c;
//        System.out.println(d);


        //Byte
//            int number = 's';
//        System.out.println(number);


        char c ='a';
        int i=50000;
        float f=343.3f;
        double d=0.1234;
        short s = 1024;
        byte b=42;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));


    }
}
