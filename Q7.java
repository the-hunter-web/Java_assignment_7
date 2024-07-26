package assignment_7;
//Write a java program to convert a decimal integer to its corresponding octal representation.
import com.sun.jdi.IntegerValue;

import java.util.*;
public class Q7 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int [] A = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 };

        System.out.println("Enter the decimal no. to convert in octal ");
        int n = sc.nextInt();

        String str = "";
        for (n = n ; n != 0 ; n = n/8){
            str = A[(n%8)] + str;
        }
        int k = Integer.valueOf(str);
        System.out.println(str);
        System.out.println(k);
    }
}
