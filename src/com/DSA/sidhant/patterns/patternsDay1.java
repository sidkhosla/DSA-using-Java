package com.DSA.sidhant.patterns;

import java.util.Scanner;

public class patternsDay1 {
    public static void main(String[] args) {
        //-------------------09 april
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int r = 1; r <= n; r++) {
//            for(int c= 1; c<=r;c++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
        //-----------------------09 april

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

        //--------------------09 april
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int r = 1; r <= n; r++) {
//            int nstars = r;
//            int nspaces = n - r;
//            // spaces
//            for (int i = 1; i <= nspaces; i++) {
//                System.out.print("\t");
//            }
//            // stars
//            for (int i = 1; i <= nstars; i++) {
//                System.out.print("*\t");
//            }
//            // line change
//            System.out.println();
//        }
        //--------------------09 april time point in video 2:10 for dry run
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                // space or star
                if (r == c || r + c == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
                // line change
                System.out.println();


            }
        }
    }
