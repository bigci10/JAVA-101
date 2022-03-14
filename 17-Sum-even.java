import java.util.Scanner;

public class Sumeven {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.println("Please enter number :");
            n = sc.nextInt();
            if (n % 4 == 0)
                sum += n;

        }while (n % 2 == 0);{


        }
        System.out.println("Sum : "+sum);

    }
}
