package com.DSA.sidhant.oneDarrays;

import java.util.Scanner;

public class find_element_in_array {
    public static void main(String[] args) {
//        1.You are given a number n, representing the size of array a.
//2.You are given n distinct numbers, representing elements of array a.
//3. You are given another number d.
//4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int j = 0; j < n; j++) {

            int input = scn.nextInt();
            arr[j] = input;
        }
        int d = scn.nextInt();


        int f = findElement(d, arr);
        System.out.println(f);
    }

    private static int findElement(int d, int[] arr) {
        int re = 0;

        for(int v = 0; v <arr.length;v++){
            if(arr[v]==d){
                re = v;
                break;
            }else re = -1;
        }
        return re;
    }
}
