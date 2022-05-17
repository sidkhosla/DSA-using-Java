package com.DSA.sidhant.recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));// 5! = 5 * 4 * 3 * 2 * 1 = 120
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
}
