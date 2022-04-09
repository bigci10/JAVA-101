import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fak = scn.nextInt();
        int i = 1;
        int factorial = 1;

        while (i < fak+1) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
        scn.close();
    }
}
