package com.DSA.sidhant;

import java.util.Scanner;

public class DSADay3 {
//1. You've to check whether a given number is prime or not.
//2. Take a number "t" as input representing count of input numbers to be tested.
//3. Take a number "n" as input "t" number of times.
//4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
//    Practise input
//5
//13
//2
//3
//4
//5
//    My solution--
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();


        for (int i = 1; i <= t; i++) {
            boolean flag = true;
            int n = scn.nextInt();
            for(int div = 2;div<=n-1;div++){
                if(n % div == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
//        ------ optimal solution
//        Scanner scn = new Scanner(System.in);
//
//        int t = scn.nextInt();
//
//        while(t != 0){
//            int n = scn.nextInt();
//
//            boolean isPrime = true;
//            for(int div = 2 ; div*div <= n ; div++){
//                if(n%div == 0){
//                    // factor
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                System.out.println("prime");
//            }else{
//                System.out.println("not prime");
//            }
//            t--;
//        }

    }
}
