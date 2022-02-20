package com.Rishav;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
//            int a=99; // allready initialised outside the block in the same method, hence you cannot
            a=100; //reassign the origin ref variable to some other value
            int c=4545;//value initialized in this block, will remain in block

        }
        System.out.println(a); // cannot use outside the block
            //scoping in for loops
        for (int  i = 0;  i < 4;  i++) {
            System.out.println(i);

        }
    }


}
