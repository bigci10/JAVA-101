import java.util.Scanner;


public class VKI {
    public static void main(String[] args) {
        float height, weight,vki;
        Scanner inp = new Scanner(System.in);

        System.out.println("Height cm :");
        height = inp.nextInt();

        System.out.println("Weight kg :");
        weight = inp.nextInt();

        vki = (weight / height * height);
        System.out.println("VKI :"+vki);
    }
}
