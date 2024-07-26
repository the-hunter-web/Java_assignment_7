package assignment_7;
//Input 10 integers from the keyboard into an array. The number to be searched is entered through
//the keyboard by the user. Write a java program to find if the number to be searched is present in
//the array and if it is present, display the number of times it appears in the array.
import java.util.*;
public class Q3 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);

        int []A = new int [10];
        for (int i = 0 ; i < A.length ; i++) {
            A[i] = sc.nextInt();
        }
//        for (int i = 0 ; i < A.length ; i++) {
//            System.out.print(A[i] + " ");
//        }

        System.out.println("Enter the number to search in array: ");
        int n = sc.nextInt();
        int count = 0 ;
        for (int i = 0 ; i < A.length ; i ++) {
            if (A[i] == n)
                count++;
        }
        String str = "";
        if (count > 1)
            str = "times";
        else
            str = "time";
        System.out.println("The number x = " + n + " occurs : " + count + " " +str);
    }
}
