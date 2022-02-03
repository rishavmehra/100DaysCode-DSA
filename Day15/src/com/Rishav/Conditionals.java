package com.Rishav;

public class Conditionals {

    public static void main(String[] args) {
	/*

        Syntax of if statement:
        if (boolean expression T or F){
            //body
        } else{
            //do this
        }



	 */
//        int salary= 90000;
//        if (salary > 10000){
//            salary += 2000;
//        }else {
//            salary+=1000;
//        }

        //Multiple if-else
    int salary=25400;
        if (salary > 10000){
            salary += 2000;
        } else if (salary>2000){
            salary += 3000;
        }else {
            salary += 1000;
        }

        System.out.println(salary);

    }
}
