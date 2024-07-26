package assignment_7;
//Write a java program to find the second largest value in an array of n elements
import java.util.*;
public class Q5 {
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int [] A = new int [size];
        System.out.println("Enter all the elements of the array : ");
        for (int i = 0 ; i < A.length ; i++) {
            A[i] = sc.nextInt();
        }
        int max1 = A[0];
        int max2 = A[0];
        for (int i = 0 ; i < A.length ; i++) {
            if (A[i] > max1 ) {
                max2 = max1 ;
                max1 = A[i];
            }
//            else if (A[i] > max2){
//                max2 = A[i];
//            }
        }
        System.out.println("Largest element of the array is " +max1);
        System.out.println("Second Largest element of the array is " +max2);
    }
}
