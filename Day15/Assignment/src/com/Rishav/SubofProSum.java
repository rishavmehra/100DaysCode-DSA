package com.Rishav;

import java.util.Scanner;

public class SubofProSum {
    public static void main(String[] args) {
        //Subtract the Product and Sum of Digits of an Integer
        Scanner in = new Scanner(System.in);
        int sum,product,n,value,sub;
        sum = 0;
        product = 1;
        n= in.nextInt();

        while(n>0){
            value=n%10;
            sum = sum+value;
            product = product * value;
            n = n /10;
        }
        System.out.println("sum is: "+sum+" \nMultiple is: "+product);
        sub=product-sum;
        System.out.println("sub is:"+sub);
    }
}
