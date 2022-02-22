package com.Rishav;

public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <accounts.length ; i++) {
            int sum=0;
            for (int j = 0; j <accounts[0].length ; j++) {
                sum = sum + accounts[i][i];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
