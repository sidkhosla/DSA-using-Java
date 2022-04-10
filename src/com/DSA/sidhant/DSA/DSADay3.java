package com.DSA.sidhant.DSA;

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
//        Scanner scn = new Scanner(System.in);
//        int t = scn.nextInt();
//
//
//        for (int i = 1; i <= t; i++) {
//            boolean flag = true;
//            int n = scn.nextInt();
//            for(int div = 2;div<=n-1;div++){
//                if(n % div == 0){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("prime");
//            }else{
//                System.out.println("not prime");
//            }
//        }
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
//        Q - 1. You've to print first n fibonacci numbers.
//2. Take as input "n", the count of fibonacci numbers to print.
//3. Print first n fibonacci numbers.
//      ---------------------  Solution
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//
//        int first = 0 , second = 1;
//
//        for(int i = 1 ; i <= n ; i = i + 1){
//
//            int third = first + second;
//            System.out.println(first);
//
//            first = second;
//            second = third;
//        }


//        HW- print all prime till n
//-------first approach--- prints correct result but descending order
//        Scanner scn = new Scanner(System.in);
//        int t = scn.nextInt();
//        while (t != 0) {
//            int n = t;
//
//            boolean isPrime = true;
//            for (int div = 2; div * div <= n; div++) {
//                if (n % div == 0) {
//                    // factor
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(n);
//            } else {
////                System.out.println("not prime");
//            }
//                t--;
//            }
//        ------second approach
        Scanner scn = new Scanner(System.in);

        int min = scn.nextInt(), max = scn.nextInt();

        while (min <= max) {
            if (isPrime(min)){
                System.out.println(min);
            }
            min++;
        }
    }
    public static boolean isPrime(int num) {
        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                // factor
                return false;
            }
        }return true;

    }
}
