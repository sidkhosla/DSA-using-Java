package com.DSA.sidhant.twoDarrays;

import java.util.Scanner;

public class twoDarraysDemo {
    //1. You are given a number n, representing the number of rows.
    //2. You are given a number m, representing the number of columns.
    //3. You are given n*m numbers, representing elements of 2d array a.
    //4. You are required to display the contents of 2d array as suggested by output format below.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int [][] mat = new int[nr][nc];

        fillMatrix(mat, scn);
        display(mat);

    }
    public static void fillMatrix(int[][] mat, Scanner scn){
        int nr = mat.length;
        int nc = mat[0].length;

        for(int i = 0;i < nr; i++){
            for(int r = 0; r < nc; r++){
                mat[i][r] = scn.nextInt();
            }
        }
    }

    public static void display(int [][] mat){
        int nr = mat.length;
        int nc = mat[0].length;

        for(int i = 0;i < nr; i++){
            for(int r = 0; r < nc; r++){
                System.out.print(mat[i][r] + " ");
            }
            System.out.println();
        }
    }

}
