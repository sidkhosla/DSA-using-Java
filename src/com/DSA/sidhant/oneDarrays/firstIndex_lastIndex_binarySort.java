package com.DSA.sidhant.oneDarrays;

import java.util.Scanner;

public class firstIndex_lastIndex_binarySort {
    // arr : 1 2 2 2 3 4 , k = 2
    public static int firstIdx(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                idx = mid;
                right = mid - 1;
            } else if (k > arr[mid]) {
                left = mid + 1;
            } else if (k < arr[mid]) {
                right = mid - 1;
            }
        }

        return idx;
    }

    public static int lastIdx(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int idx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                idx = mid;
                left = mid + 1;
            } else if (k > arr[mid]) {
                left = mid + 1;
            } else if (k < arr[mid]) {
                right = mid - 1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ele = scn.nextInt();

        System.out.println(firstIdx(arr, ele));
        System.out.println(lastIdx(arr, ele));
    }
}