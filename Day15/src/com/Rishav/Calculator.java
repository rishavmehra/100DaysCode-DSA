package com.Rishav;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        //take Input from till user des not prss x and X
            while (true){
                //take the input operator as input
                System.out.println("Enter the operator: ");
                char op=in.next().trim().charAt(0);
                if (op=='+'|| op=='-' || op=='*'|| op=='/' || op=='%'){
                    // input to number
                    System.out.println("Enter two Number: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    if (op=='+'){
                            ans= num1+num2;

                    }
                    if (op=='-'){
                        ans= num1*num2;

                    }
                    if (op=='*'){
                        ans= num1*num2;

                    }
                    if (op=='/'){
                        if (num2!=0){
                            ans= num1/num2;
                        }

                    }
                    if (op=='%'){
                        ans= num1%num2;

                    }

                }else if (op=='x'||op=='X'){
                    break;
                }else{
                    System.out.println("Invalid operation!!  ");
                }

                System.out.println(ans);
            }

    }


}
