package com.DSA.sidhant.extra_questions;

import java.util.Scanner;

public class pointOfParity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum = sum +arr[i];
        }

        int lsum = 0;
        for(int i  = 0; i<arr.length; i++){
            sum = sum - arr[i];

            if(lsum == sum){
                System.out.print(i);
                return;
            }
            lsum = lsum + arr[i];
        }

        System.out.print(-1);


    }
}
