package com.DSA.sidhant.patterns;

import java.util.Scanner;

public class patternsDay1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int r = 1; r <= n; r++) {
//            for(int c= 1; c<=r;c++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
        //-----------------------

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int r = 1; r <= n; r++) {
//            int nst = n+1 - r;
//            for(int i= 1; i<=nst;i++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

        //--------------------
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) {
            int nst = n+1 - r;
            for(int i= 1; i<=nst;i++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
