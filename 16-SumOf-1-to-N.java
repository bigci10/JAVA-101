import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number :");
        int input = sc.nextInt();
        double average = 0;
        int sayac = 0;

        for (int i = 1; i < input+1;i++){
            if (i % 3 == 0 && i % 4 == 0){
                average += i;
                sayac++;
            }
        }
        System.out.println("Average :"+(average/sayac));
    }
}
