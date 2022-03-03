package com.Rishav;

public class SearchStrings {
    public static void main(String[] args) {
        String name="Rishav";
        char target='a';
        boolean ans = search(name,target);
        System.out.println(ans);
    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            char element =    str.charAt(i);
            if (target==element){
                return true;
            }
        }
        return false;
    }
}
