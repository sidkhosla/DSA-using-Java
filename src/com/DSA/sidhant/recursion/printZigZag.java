package com.DSA.sidhant.recursion;

import java.util.Scanner;

//https://nados.io/question/print-zigzag

public class printZigZag {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 3;
        //try with int 3 as n;
        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0) return;
        if (n == 1) { System.out.print("111"); return;}

        System.out.print(n);

        pzz(n - 1);
        System.out.print(n);

        pzz(n - 1);
        System.out.print(n);
    }

}
