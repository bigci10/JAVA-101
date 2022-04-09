import java.util.*;

import static java.lang.System.*;

public class Combination {
        static int fact(int a) {
            int factorial = 1;
            for (int i = 1; i <= a; i++) {
                factorial = factorial * i;
            }
            return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int kombinasyon=fact(n)/(fact(n-r)*fact(r));
        System.out.println("C(n,r) ="+kombinasyon);

        sc.close();
    }
}
