package com.Rishav;

public class MinAndMax {
    static pair getMinMax(long a[], long n)
    {
        //Find minimum and maximum element in an array(gfg)
        long max=a[0];
        long min=a[0];
        for(int i=1; i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        pair p = new pair(min,max);
        return p;
    }

}
