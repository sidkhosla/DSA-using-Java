package com.DSA.sidhant.patterns;

import java.util.Scanner;

public class patternsDay4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // input

        // 1st part
        // for(int i = 1 ; i <= n ; i++){
        //     System.out.print("*\t");
        // }

        // // 2nd part
        // for(int r = 1 ; r <= n ; r++){
        //     for(int c = 1 ; c <= n ; c++){
        //         System.out.print("*\t");
        //     }

        //     // line change
        //     System.out.println();
        // }

        // 3rd,4th,5th part- P20
//        for(int r = 1 ; r <= n ; r++){
//            for(int c = 1 ; c <= n ; c++){
//                if(c == 1 || c == n){
//                    System.out.print("*\t"); // first col or last col
//                    //for W
//                }else  if(r > n/2 && (r == c || r + c == n+1))
//                //for M->
//                 //else  if(r <= n/2+1 && (r == c || r + c == n+1))
//                {
//                    System.out.print("*\t"); // second half && ldiag or rdiag
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            // line change
//            System.out.println();
//        }

        //-----------P17
//        int row = 1, nspaces = n/2 , nstars = 1;
//        while(row <= n){
//            // code for each row
//            for(int i = 1 ; i <= nspaces ; i++){
//                if(row == n/2+1){
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            for(int i = 1 ; i <= nstars ; i++){
//                System.out.print("*\t");
//            }
//            // line change
//            System.out.println();
//            // preparation for next row
//            if(row <= n/2){
//                nstars++;
//            }else{
//                nstars--;
//            }
//            row++;
//        }
        //-----------P10
//
//        int row = 1, nstars = 1, nrow = n, nspaces = n / 2;
//        while (row <= nrow) {
//            // work for each row
//            // spaces
//            for (int i = 1; i <= nspaces; i++) {
//                System.out.print("\t");
//                // stars
//            }
//                for (int i = 1; i <= nstars; i++) {
//                    if (i == 1 || i == nstars) {
//                        System.out.print("*\t");
//                    } else {
//                        System.out.print("\t");
//                    }
//                }
//                    // line change
//                    System.out.println();
//                    // preparation for next row
//                    if (row <= n / 2) {
//                        nspaces = nspaces - 1;
//                        nstars = nstars + 2;
//                    } else {
//                        nspaces = nspaces + 1;
//                        nstars = nstars - 2;
//                    }
//            row++;
//        }
        //-------------P18

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
