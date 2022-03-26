package com.DSA.sidhant;

import java.util.Scanner;

public class DSADay1 {
    public static void main(String[] args) {
//        Class practise
//        System.out.println("*****\n" +
//                "   * \n" +
//                "  * \n" +
//                " *    \n" +
//                "*****");
//        System.out.println("   * ");
//        System.out.println("  *  ");
//        System.out.println(" *   ");
//        System.out.println("*****");
//        int a = 102, b = 104, c = 105;
//
//        if(a>b){
//            if(a>c){
//                System.out.println("a is largest");
//            } else{
//                System.out.println("c is largest");
//            }
//        }else if(b>c){
//            System.out.println("b is the largest");
//        }else{
//            System.out.println("c is the largest");
//        }

//        Question
//        --
//        1. You are given as input marks of a student.
//        2. Display an appropriate message based on the following rules:
//        2.1 for marks above 90, print excellent.
//        2.2 for marks above 80 and less than equal to 90, print good.
//        2.3 for marks above 70 and less than equal to 80, print fair.
//        2.4 for marks above 60 and less than equal to 70, print meets expectations.
//        2.5 for marks less than equal to 60, print below par.
//        --
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if (marks > 90) {
            System.out.println(" excellent");
        } else if (marks > 80) {
            System.out.println(" good ");
        } else if (marks > 70) {
            System.out.println(" fair ");
        }
            else if (marks > 60) {
                System.out.println(" meets Expectations ");
            } else {
                System.out.println(" below Par");
            }
        }
    }

