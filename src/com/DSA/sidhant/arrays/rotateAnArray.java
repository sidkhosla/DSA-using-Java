package com.DSA.sidhant.arrays;

import java.util.Scanner;

public class rotateAnArray {
    //    1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are given a number k.
//4. Rotate the array a, k times to the right (for positive values of k), and to
//the left for negative values of k.

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        //  input
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        // rotate
        rotate(arr, k);
        // display
        display(arr);
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;

        if (k < 0)
            k = k + arr.length;

        // reverse part 2
        reverse(arr, arr.length - k, arr.length - 1);
        // reverse part 1
        reverse(arr, 0, arr.length - k - 1);
        // reverse arr
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    public static void display(int[] arr) {
        for (int vl : arr) {
            System.out.print(vl + " ");
        }
    }
}
