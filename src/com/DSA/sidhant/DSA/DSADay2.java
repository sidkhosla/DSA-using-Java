package com.DSA.sidhant.DSA;

import java.util.Scanner;

public class DSADay2 {
    public static void main(String[] args) {
        System.out.println("*hello world*");

//        for(int i = 1; i <= 5; i++){
//            System.out.println("hello " + i);
//        }
//-------
//       Maths formula to do sum of numbers- sum = (sum*(sum+1))/2;
//        int i =100;
//        int sum = i * (i+1) / 2;
//        System.out.println(sum);
//------- answers of questions related to loop asked in class
/* 1. 0, 0, 0, - infinite?
   2. 5, 6, 12
   3. 2, 3, 4, 5, 6, 7, 8, 9, 10
   sum 1 to 100
 */
//------- using Scanner to take input from the user
//        Scanner scn = new Scanner(System.in);
//        int val = scn.nextInt();
//
//        System.out.println("Value : "+val);
//
//------- 1. You've to count the number of digits in a number.
//2. Take as input "n", the number for which the digits has to be counted.
//3. Print the digits in that number.
//        Scanner scn = new Scanner(System.in);
//        int num = scn.nextInt();
//        int count = 0;
        //using for loop
//        for(; num != 0; ) {
//            num /= 10;
//            count++;
//        }
        //using while loop
//        while(num !=0){
//            num = num / 10;
//            count++;
//        }
//        System.out.println("Number of digits: " + count);
//-------1. You've to display the digits of a number in reverse.
//2. Take as input "n", the number for which digits have to be display in reverse.
//3. Print the digits of the number line-wise, but in reverse order.
//        Scanner scn = new Scanner(System.in);
//        int num = scn.nextInt();
//        while(num != 0) {
//            // get last digit from num
//            int digit = num % 10;
//            //print last digit
//            System.out.println(digit);
//            //using / delete the last digit of the number
//            num = num / 10;
//        }

//  1. You are required to check if a given set of numbers is a valid pythagorean triplet.
//  2. Take as input three numbers a, b and c.
//  3. Print true if they can form a pythagorean triplet and false otherwise.
//        in - 5, 3, 4. Out - True
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int largestSide;
        int firstSmallSide;
        int secondSmallSide;

        if(a>b){
            if(a>c){
                largestSide = a;
                firstSmallSide = b;
                secondSmallSide = c;
            } else{
                largestSide = c;
                firstSmallSide = a;
                secondSmallSide = b;
            }
        }else if(b>c){
            largestSide = b;
            firstSmallSide = a;
            secondSmallSide = c;
        }else{
            largestSide = c;
            firstSmallSide = a;
            secondSmallSide = b;
        }
        System.out.println(largestSide * largestSide
                == firstSmallSide * firstSmallSide + secondSmallSide * secondSmallSide);

    }



}
