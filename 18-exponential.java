import java.util.*;

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Please enter the last number: ");

        int five = 1;
        for (int i = 1;i < n; i*=4){
            System.out.println(i);
            System.out.println(five);
            five*=5;


        }
    }
}
