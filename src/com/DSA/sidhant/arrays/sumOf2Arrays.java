package com.DSA.sidhant.arrays;

import java.util.Scanner;

//1. You are given a number n1, representing the size of array a1.
//2. You are given n1 numbers, representing elements of array a1.
//3. You are given a number n2, representing the size of array a2.
//4. You are given n2 numbers, representing elements of array a2.
//5. The two arrays represent digits of two numbers.
//6. You are required to add the numbers represented by two arrays and print the
//arrays.
// dry run at 2:55 min- 19th april
public class sumOf2Arrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] res = sum(arr1, arr2);
        display(res);
    }

    public static void display(int[] arr) {
        for (int vl : arr) {
            System.out.println(vl);
        }
    }


    public static int[] sum(int[] arr1, int[] arr2) {
        int size = Math.max(arr1.length, arr2.length);

        int[] res = new int[size];

        int p1 = arr1.length - 1, p2 = arr2.length - 1, p3 = size - 1;
        int carry = 0;

        while (p3 >= 0) {
            int v1 = (p1 >= 0) ? arr1[p1] : 0;//turnery operator"?" checks if the first statement is true or false
            //if (p1>=0) then set v1 to arr1[p1] else set it to 0
            int v2 = (p2 >= 0) ? arr2[p2] : 0;

            int sum = v1 + v2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            res[p3] = digit;

            p1--;
            p2--;
            p3--;
        }

        if (carry == 0) {
            return res;
        } else {
            int[] newRes = new int[size + 1];
            newRes[0] = carry;
            for (int i = 1; i < newRes.length; i++) {
                newRes[i] = res[i - 1];
            }
            return newRes;
        }
    }
}
