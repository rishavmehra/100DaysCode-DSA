package com.Rishav;

public class Test {
    public static void main(String[] args) {


        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
    }

    static int swap(int num1, int num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        return temp;
    }


}
