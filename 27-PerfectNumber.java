import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sayac1 = 2;

        int total1 = 1;

        int a = sc.nextInt();


        while (sayac1 < a){
            if (a % sayac1 == 0) {
                total1 += sayac1;
                sayac1++;
            }
            else
                sayac1 ++;}
        if(total1 == a)
            System.out.println(a+" is a Perfect Number");
        else
            System.out.println(a+" is not Perfect Number");
    }

}
