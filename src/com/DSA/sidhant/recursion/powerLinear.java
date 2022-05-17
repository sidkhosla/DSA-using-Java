package com.DSA.sidhant.recursion;

public class powerLinear {
    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println(power(2, 5));
    }

    public static int power(int x, int n){

        if(n == 0) return 1;
        return x * (power(x,n -1 ));
    }
}
