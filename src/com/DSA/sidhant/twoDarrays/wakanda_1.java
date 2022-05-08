package com.DSA.sidhant.twoDarrays;

import java.util.Scanner;

//https://nados.io/question/the-state-of-wakanda-1
public class wakanda_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int [][] mat = new int[nr][nc];

        fillMatrix(mat, scn);
        stateOfWakanda1(mat);

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

    public static void stateOfWakanda1(int[][] mat) {
        int nc = mat[0].length;
        int nr = mat.length;
        for (int c = 0; c < nc; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < nr; r++) {
                    System.out.println(mat[r][c]);
                    // even, top -> bottom
                }
            } else { // odd, bottom -> top
                for (int r = nr - 1; r >= 0; r--) {
                    System.out.println(mat[r][c]);
                }
            }
        }
    }
}
