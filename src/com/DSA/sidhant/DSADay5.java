package com.DSA.sidhant;

import java.util.Scanner;

public class DSADay5 {
        //    1. You are given a number following certain constraints.
//2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
//3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153
//4. Take as input number "n", assume that the number will follow constraints.
//5. Print it's inverse.
        public static void main (String[]args){
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int ans = 0;
//        int pos = 1;
//        while(n!=0){
//            int digit = n % 10;
//            ans += (pos*Math.pow(10,digit-1));
//
//            n = n/10;
//            pos++;
//
//        }
//        System.out.println(ans);
//

//        1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
//2. Take as input n and k.
//3. Print the rotated number.
//4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//   n = 12340056
//   k = 3
//   r = 05612340
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int k = scn.nextInt();
            int p1 = 0, p2 = 0;
            int count = 0;
            int temp = n;
            while(temp != 0){
                temp = temp/10;
                count++;
            }
            //true rotation
            k = k % count;
            // negative rotations
            if(k < 0){
                k += count;
            }
            p2 += (n % (Math.pow(10, k)));
            //print last digit
            System.out.println(p2);
            //using / delete the last digit of the number
            p1 += (n / (Math.pow(10, k)));
            System.out.println(p1);
            //merge
            int mergeHelper = (int)Math.pow(10,count-k);
            int ans = (p2*mergeHelper) + p1;

            System.out.println(ans);
        }
}

