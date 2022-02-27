package com.Rishav;

public class FindFreq {
    int findFrequency(int A[], int x){
        int count = 0;
        int l = A.length;
        for(int i=0;i<l;i++){
            if(A[i] == x){
                count++;
            }
        }
        return count;
    }
}
/*    Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.
Input:
N = 5
vector = {1, 1, 1, 1, 1}
X = 1
Output:
5
Explanation: Frequency of 1 is 5.


*/