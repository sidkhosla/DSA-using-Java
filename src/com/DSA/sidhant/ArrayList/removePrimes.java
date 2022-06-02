package com.DSA.sidhant.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrimes {
    public static boolean checkPrime(int num) {
        for (int fac = 2; fac * fac <= num; fac++) {
            if (num % fac == 0) return false;
        }
        return true;
    }

    public static void removePrimes(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (checkPrime(list.get(i))) list.remove(i);
        }
    }
    public static void main(String[] args) {
        //creating arraylist by taking inputs

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        // calling removePrimes method to remove the prime numbers from the al

        removePrimes(al);

        System.out.println(al);
    }
}
