import java.util.*;

public class Binary {

    static public boolean binarydetect(int number){
        int copynumber = number;

        while (copynumber != 0) {
            if (copynumber % 10 > 1) {

                return false;
            }
            copynumber = copynumber / 10;
        }
        return true;



    }

    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number");
        int inp = s.nextInt();

        System.out.printf("is a binary number? %b %n",
                101, binarydetect(101));

    }
}
