package com.Rishav;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans= in.nextInt();
        System.out.println(armstrong(ans));
    }

    //print  all the 3 digit armstrong number
    static boolean armstrong(int n){
            int sum=0;
            int ori=n;
        while (n>0){
           int rem = n%10;
           int cube = rem *rem *rem;
           sum = sum +cube;
            n=n/10;
       }

        return sum == ori;
    }



    static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        int c=2;
        while(c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }

        if (c*c>n){
            return true;
        }
        return false;
    }


}
