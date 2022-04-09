import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int number= sc.nextInt();
        double result = 0;

        for (double i = 1; i <= number; i++){
            result += (1/i);}
        System.out.println(result);

    }
}
