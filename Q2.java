package assignment_7;
//Write a java program using an array that reads the integers between 1 and 100 and counts the
//        occurrences of each. Assume the input ends with 0. Here is a sample run of the program:
//        Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
//        2 occurs 2 times
//        3 occurs 1 time
//        4 occurs 1 time
//        5 occurs 2 times
//        6 occurs 1 time
//        23 occurs 1 time
//        43 occurs 1 time
//        Note that if a number occurs more than one time, the plural word
//        “times” is used in the output.
import java.util.*;
public class Q2 {
    public static void main (String [] args) {
        int A[] = {2,5,6,5,4,3,23,43,2,0};
//        int count = 0 ;


        for (int i = 0 ; i <A.length ; i++){
            int count = 0 ;
            for (int j = 0 ; j <= 100 ; j++) {
                if (A[i] == j){
                    count = count +1;
                }
            }

            System.out.println(A[i] + " appears " + count + " times");
        }
    }
}
