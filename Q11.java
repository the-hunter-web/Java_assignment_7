package assignment_7;

public class Q11 {
    public static void main(String[] args) {

        int [] A = new int [11];
        A[0] = 1;
        A[1] = 1;
        A[2] = 1;A[3] = 1;A[4] = 1;A[5] = 1; A[7] = 99;
        int index = 3;
        for (int i = index ; i < A.length-1 ;i++)
            A[i] =A[i+1];

        for (int k : A) {
            System.out.print( k + " ");
        }
    }
}
