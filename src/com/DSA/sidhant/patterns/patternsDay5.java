package com.DSA.sidhant.patterns;

import java.util.Scanner;

public class patternsDay5 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//        int middle = n/2+1;
//        for(int r = 1 ; r <= n ; r++){
//            for(int c = 1 ; c <= n ; c++){
//                if(r == 1){
//                    if(c <= middle || c == n){
//                        System.out.print("*\t");
//                    }else{
//                        System.out.print("\t");
//                    }
//                }else if(r > 1 && r < middle){
//                    if(c == n || c == middle){
//                        System.out.print("*\t");
//                    }else{
//                        System.out.print("\t");
//                    }
//                }else if(r == middle){
//                    System.out.print("*\t");
//                }else if(r > middle && r < n){
//                    if(c == 1 || c == middle){
//                        System.out.print("*\t");
//                    }else{
//                        System.out.print("\t");
//                    }
//                }else if(r == n){
//                    if(c >= middle || c == 1){
//                        System.out.print("*\t");
//                    }else{
//                        System.out.print("\t");
//                    }
//                }
//            }
//            System.out.println();
//        }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 0; row < n; row++){
            int ncr=1;
            for(int col = 0; col <= row; col++){
                System.out.print(ncr + "\t");
                ncr = (ncr * (row - col)) / (col + 1);
            }
            System.out.println();
        }
    }
}
