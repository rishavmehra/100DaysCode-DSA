package com.Rishav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Synatax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(34);
//        list.add(3434);
//        list.add(843);
//        list.add(742);
//        list.add(54);
//        list.add(342);
//        list.add(344);
//        list.add(23);
//
//        System.out.println(list);
//        list.set(2, 45450);
//        list.remove(0);
//        System.out.println(list);

        for (int i = 0; i <6 ; i++) {
            list.add(in.nextInt());
        }

        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
        }



    }
}
