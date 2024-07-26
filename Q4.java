package assignment_7;
//Write a method that finds the smallest element in an array of double values using the following
//header:
//public static double min(double[] array)
//Write a java program that prompts the user to enter ten numbers, invokes this method to return
//the minimum value, and displays the minimum value. Here is a sample run of the program:
//Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
//The minimum number is: 1.5
public class Q4 {
    double min(double []B){
        double min = B[3];
        for (int i = 0 ; i <B.length ; i++) {
            if (B[i] < min) {
                min = B[i];
            }
        }
        return min;
    }
    public static void main (String [] args ) {
        Q4 call = new Q4();
        double []A = {1.9 , 2.5 , 3.7 , 2 , 7.1 , 1.5 , 6 , 3, 4 ,5 ,2};
        call.min(A);
        double min = call.min(A);
        System.out.println("Min value is : " + min);
    }
}
