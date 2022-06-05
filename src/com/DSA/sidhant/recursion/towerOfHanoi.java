package com.DSA.sidhant.recursion;

import java.util.Scanner;

public class towerOfHanoi {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();
        toh(n, src, dest, helper);

    }

    public static void toh ( int numberOfDisks, int SourceStack, int destinationStack, int helperStack){
        if (numberOfDisks == 0) return;
        toh(numberOfDisks - 1, SourceStack, helperStack, destinationStack);
        System.out.println(numberOfDisks + "[" + SourceStack + " -> " + destinationStack + "]");
        toh(numberOfDisks - 1, helperStack, destinationStack, SourceStack);

    }
}
