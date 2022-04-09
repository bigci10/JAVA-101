import java.util.Scanner;

public class ActivitySuggest{
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.println("Please Enter Temperature :");
        heat = inp.nextInt();

        if (heat < 5 ) {
            System.out.println("Read a book.");
        }
        else if (heat>=5 && heat<=15) {
            System.out.println("Go to running");
        }
        else if (heat>=15 && heat<=25) {
            System.out.println("Go to play soccer");
        }
        else if (heat>25) {
            System.out.println("Swimming");
        }

    }

}
