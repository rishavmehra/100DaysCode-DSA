package com.Rishav;

import java.util.Scanner;

public class LargestUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        int number,temp;
        do{
            number=in.nextInt();
            temp=number;
            if(temp>max){
                max=number;
            }

        }while(number!=0);
        System.out.println(max);




    }
}
