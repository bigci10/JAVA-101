import java.util.*;
//Calculates the sum of the digits of a number.

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int number= sc.nextInt();
        int total = 0;

        while (number > 0) {
            System.out.println( number % 10);
            total += number % 10;
            number = number/10;

        }
        System.out.println(total);
        
    }
}
