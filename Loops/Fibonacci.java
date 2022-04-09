import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fib = scn.nextInt();
        int a1 = 0;
        int a2 = 1;
        int sayac = 0;

        if (fib < 0)
            System.out.println("Please enter positive");
        else if (fib == 1)
            System.out.println(a1);
        else
            while (sayac < fib-2){
                int aa1 = a1+a2;
                System.out.println(aa1);
                a1 = a2;
                a2 = aa1;
                sayac ++;

            }
            scn.close()

    }
}
