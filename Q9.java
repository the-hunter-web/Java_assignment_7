package assignment_7;
//You can compute the standard deviation with the following formula; you have to store the
//individual numbers using an array, so that they can be used after the mean is obtained
//Your program should contain the following methods:
///** Compute the deviation of double values */
//public static double deviation(double[] x)
///** Compute the mean of an array of double values */
//public static double mean(double[] x)
//Write a java program that prompts the user to enter ten numbers and displays the mean and
//        standard deviation, as shown in the following sample run:
//Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
//The mean is 3.11
//The standard deviation is 1.55738
        import java.util.Scanner;
public class Q9 {
    double mean(double[] x) {
        double sum = 0;
        for (int i = 0 ; i < x.length ; i++) {
            sum = x[i] + sum;
        }
        double mean = sum / x.length;
        return mean;
    }
    double deviation (double [] x) {
        double sum = 0;
        for (int i = 0 ; i < x.length ; i++) {
            sum = (Math.pow((x[i] - mean(x)), 2)) + sum;
        }
//        double cal1 = sum - mean(x);
//        double cal2 = Math.pow(sum , 2);
        double cal3 = (sum / (x.length-1));
        return Math.pow(cal3 ,1.0/2.0);
    }

    public static void main (String [] args){
        Q9 call = new Q9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        double []A = new double [size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0 ; i < A.length ; i++) {
            A[i] = sc.nextDouble();
        }
        System.out.println();
        System.out.print("The elements of the array are : ");
        for (int i = 0 ; i < A.length ; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println(call.mean(A));
        System.out.println(call.deviation(A));
    }
}
