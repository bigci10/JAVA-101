import java.util.Scanner;



public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sayac1 = 2;

        int total1 = 1;
        int total2 = 1;

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a > 1 && b > 1)
            if (a % sayac1 == 0 && b % sayac1 == 0){
                a = a / sayac1;
                b = b / sayac1;
                
                total1*=sayac1;
                total2*=sayac1;
            }
            else if(a % sayac1 == 0){
                a = a/ sayac1;
                total1*=sayac1;
            }
            else if(b % sayac1 == 0){
                b = b/sayac1;
                total1 *= sayac1;
            }
            else
                sayac1 ++;
        System.out.println("EKOK: "+total1);
        System.out.println("EBOB: "+total2);

    }

}
