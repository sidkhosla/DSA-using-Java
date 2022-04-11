package com.DSA.sidhant.patterns;

import java.util.Scanner;

public class patternsDay2 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//
//        int row = 1 , nstars = 1 , nrow = n , nspaces = n/2 , val = 1;
//
//        while(row <= nrow){
//            // work for each row
//            // spaces
//            for(int i = 1 ; i <= nspaces ; i++){
//                System.out.print("\t");
//            }
//            // stars
//            int tmp = val;
//            for(int i = 1 ; i <= nstars ; i++){
//                System.out.print(tmp+"\t");
//                if(i <= nstars/2){
//                    tmp++;
//                }else{
//                    tmp--;
//                }
//            }
//            // line change
//            System.out.println();
//
//            // preparation for next row
//            if(row <= n/2){
//                nspaces = nspaces - 1;
//                nstars = nstars + 2;
//                val++;
//            }else{
//                nspaces = nspaces + 1;
//                nstars = nstars - 2;
//                val--;
//            }
//
//            row++;
//        }
//
//--------------------------
            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();

            int row = 1, nspaces = 1, nstars =(n+1)/2;

            while(row <= n){
                // code for each row

                // nstars
                for(int i = 1 ; i <= nstars ; i++){
                    System.out.print("*\t");
                }
                // nspaces
                for(int i = 1 ; i <= nspaces ; i++){
                    System.out.print("\t");
                }
                // nstars
                for(int i = 1 ; i <= nstars ; i++){
                    System.out.print("*\t");
                }

                // line change
                System.out.println();

                // preparation for next row
                if(row <= n/2){
                    nstars = nstars - 1;
                    nspaces = nspaces + 2;
                }else{
                    nstars = nstars + 1;
                    nspaces = nspaces - 2;
                }
                row++;
            }
        }
    }
