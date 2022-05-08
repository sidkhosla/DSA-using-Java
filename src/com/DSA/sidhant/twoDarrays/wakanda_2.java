package com.DSA.sidhant.twoDarrays;

import java.util.Scanner;

public class wakanda_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int[][] mat = new int[nr][nr];

        fillMatrix(mat, scn);
        stateOfWakanda2(mat);


    }

    public static void fillMatrix(int[][] mat, Scanner scn) {
        int nr = mat.length;
        int nc = mat[0].length;

        for (int i = 0; i < nr; i++) {
            for (int r = 0; r < nc; r++) {
                mat[i][r] = scn.nextInt();
            }
        }
    }

    public static void stateOfWakanda2(int[][] mat) {
        int n = mat.length;
        for (int gap = 0; gap < n; gap++) {
            int r = 0, c = gap;

            while (r < n && c < n) {
                System.out.println(mat[r][c]);
                r++;
                c++;
            }
        }
    }
}
