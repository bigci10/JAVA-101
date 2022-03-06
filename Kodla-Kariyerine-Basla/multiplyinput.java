import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i;

        for(i = 0; i < 11; i++){
            System.out.println(i+"*"+n+"="+(i * n));
        }
        input.close();
    }

}
