package com.DSA.sidhant.recursion;

public class printIncreasing {
    public static void printIncreasing(int n) {
        if (n == 0) return;

        printIncreasing(n - 1); // faith
        System.out.println(n);
    }

    public static void printDecreasing(int n) {

        System.out.println(n);
        if(n == 1) return;
        printDecreasing(n-1);
    }

    public static void printDecreasingIncreasing(int n){
        //hw
        System.out.println(n);
        if(n <= 1){
            System.out.println(n);
            printDecreasingIncreasing(n+1);
        }
        printDecreasingIncreasing(n-1);
    }


    public static void main(String[] args) {
        printIncreasing(5); // 1 2 3 4 5
        printDecreasing(5); // 5 4 3 2 1
        printDecreasingIncreasing(3); //3 2 1 1 2 3
    }

}
