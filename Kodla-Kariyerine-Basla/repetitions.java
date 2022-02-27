import java.util.*;


public class repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the text :");
        String text = input.nextLine();

        System.out.println("Total repetition");
        int sayac = input.nextInt();

        for (int i = 0; i < sayac; i++) {
            System.out.println(text);
            }
        }
}
