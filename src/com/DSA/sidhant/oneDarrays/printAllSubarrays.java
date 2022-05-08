package com.DSA.sidhant.oneDarrays;

import java.util.Scanner;

public class printAllSubarrays {
    public static void printAllSubArrays(int[] arr) {
        for (int sp = 0; sp < arr.length; sp++) {
            for (int ep = sp; ep < arr.length; ep++) {

                for (int i = sp; i <= ep; i++) {
                    System.out.print(arr[i] + "\t");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printAllSubArrays(arr);


    }
}
