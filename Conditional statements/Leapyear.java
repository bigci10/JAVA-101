import java.util.*;


public class Leapyear {
    // Complete the solve function below.
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");

        year = input.nextInt();

        if((year % 4 == 0 )&& (year % 400 == 0)){
            System.out.println(year + " is a leap year!");
        }

        else{
            System.out.println("is not a leap year!");
        }
    }
}
