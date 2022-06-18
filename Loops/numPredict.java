import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random rnd = new Random();

    Scanner sc = new Scanner(System.in);

    int number = rnd.nextInt(100);
    System.out.println("You have 3 chance for the predict number");

    int chance = 3;
    while (chance > 0){
      System.out.println("Please enter your predict");
      int pred = sc.nextInt();
      if (pred == number){
        System.out.println("You're win congratilations");
      }    
      else{
        System.out.println("Try again");
      }
      chance --;
      
    }
  }
}
