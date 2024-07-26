package assignment_7;

public class Q13 {
    public static void main(String[] args) {
        String str = "aasshhiisshh";
        String str2 = str.replaceAll("[^a-z]+" ,"[a-z]" );
        System.out.println(str2);
    }
}
