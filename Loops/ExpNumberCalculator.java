import java.util.*;



public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long result = 1;

        for (;r != 0;r--){
            result *= n;
        }
        System.out.println(result);


    }
}
