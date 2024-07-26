package assignment_7;
//Write a java program that implements the array reversal algorithm suggested in Note 1.
//        Note 1: There is a simpler algorithm for array reversal that starts
//        out with two indices, i=0 and j=n-1. With each iteration i is
//        increased and j is decreased for i<j.

import java.util.*;
public class Q6 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        int [] A = {0,1,2,3,4,5,6,7,8,9};
        int [] B = new int [A.length];

        for (int i = A.length-1 , j = 0 ; i >= 0 ; i-- , j++) {
            B[j] = A[i];
        }

        for (int i = 0 ; i < B.length ; i++) {
            System.out.print(B[i] + " , ");
        }
    }
}
