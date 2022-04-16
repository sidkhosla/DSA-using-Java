package com.DSA.sidhant.arrays;

import java.util.Scanner;

public class arraysDay1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
// my method array out of bounds exception
        String temp = Integer.toString(n);
        int[] newGuess = new int[temp.length()];
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
            if(newGuess[i] ==d){
                count++;
            }
        }
        return count;
    }
    //-- sir's solution----------------
//        int count = 0;
//
//        while(n!=0){
//            int digit = n%10;
//            n=n/10;
//            if(digit ==d){
//                count++;
//            }
//        }
//        return count;
//    }
    //---------------------

}