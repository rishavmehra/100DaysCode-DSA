package com.Rishav;

public class ReverseString {
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        //Reverse a String
        int len=str.length();
        String rev="";
        // "RISHAV" len:6, i=6-1=5, And 5=V, i-- from backward
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}
