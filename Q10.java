package assignment_7;

public class Q10 {
    public static void main(String[] args) {

        int [] A = new int [11];
        A[0] = 1;
        A[1] = 1;
        A[2] = 1;A[3] = 1;A[4] = 1;A[5] = 1;

        int index = 4 ;
        int x = 55;
        for (int i = A.length -1 ; i> index ; i-- )
            A[i] = A[i - 1];
            A[index] = x;

        for (int k : A) {
            System.out.print( k + " ");
        }
    }
}
