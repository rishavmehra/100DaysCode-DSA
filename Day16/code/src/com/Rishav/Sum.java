package com.Rishav;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int result = sum2();
//        System.out.println(result);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1 = in.nextInt();
        System.out.println("Enter Number2:");
        int num2 = in.nextInt();
        int ans =sum3(num1,num2);
        System.out.println(ans);

    }

    //pass the value of  numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }



    // return method
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Emter number1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    // simple print calling method
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Emter number1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum: "+sum);

    }

    /*
        return_type name(){
            //body
            return statement;
        }
     */
}
