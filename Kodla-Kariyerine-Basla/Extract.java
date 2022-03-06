import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("Please enter the line :");

        String[] dizi = new String[str.length()];
        String all = "";

        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);

            if (harf.matches("[a-zA-Z]+") == false) {
                all+=harf;
            }
        }
        s.close();
        System.out.println(all);
    }
}
