package assignment_7;
//Write a java program to create an array of size N and store the random values in it and find the
//sum and average.
import java.lang.Math;
import java.util.*;
public class Q1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int [] A = new int [size];
        int sum = 0;

        for (int i = 0 ; i < A.length ; i++ ){
            A[i] = ((int)(Math.random()*9) + 1);
            sum = sum + A[i];
//            System.out.print(A[i] + " ");
        }
        for (int i = 0 ; i <A.length ; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();
        float avg =(float) (sum/size);
        System.out.println("The sum of the element is : " + sum);
        System.out.println("The average of the element is : " + avg);

    }
}
