package com.DSA.sidhant.oneDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Span_of_array {
//    1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int j = 0; j< n;j++){

            int input = scn.nextInt();
            arr[j] = input;
        }

        int f = spanOfArray(n, arr);
        System.out.println(f);
    }

    private static int spanOfArray(int n, int[] arr) {

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return max-min;
    }
}
