import java.util.*;


public class Test {
    public static void main(String[] args) {
        System.out.println("Numbers :");
        Scanner input = new Scanner(System.in);


        Integer[] array = new Integer[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        System.out.println("Total Sum :"+sum);


    }

}
