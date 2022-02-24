
import java.sql.SQLOutput;
import java.util.*;


public class birthyearzodyag {
    // Complete the solve function below.
    public static void main(String[] args) {
        int birthyear;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter birth year :");
        birthyear = input.nextInt();

        switch (birthyear % 12){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Cock");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Mouse");
                break;
            case 5:
                System.out.println("Bull");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
        }

    }
}
