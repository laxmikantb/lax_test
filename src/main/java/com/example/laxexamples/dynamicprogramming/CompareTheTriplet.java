package com.example.laxexamples.dynamicprogramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a_triplet = new int[3];
        int[] b_triplet = new int[3];
        for (int i = 0; i < 3; i++) {
            a_triplet[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b_triplet[i] = in.nextInt();
        }
        int alice_points = 0;
        int bob_points = 0;
        for (int i = 0; i < 3; i++) {
            if (a_triplet[i] > b_triplet[i]) {
                alice_points += 1;
            } else if (a_triplet[i] < b_triplet[i]) {
                bob_points += 1;
            }
        }
        System.out.printf("%d %d", alice_points, bob_points);
        
       
        
    }
    
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] result = new int[2];
        int pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0) ;
        int pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0) ;
        result[0] = pointsAlice;
        result[1] = pointsBob;

        return result;
    }
}