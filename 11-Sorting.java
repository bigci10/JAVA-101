import java.util.Scanner;

public class Sorting{
    public static void main(String[] args) {

        float a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.println("1.Number :");
        a = inp.nextFloat();

        System.out.println("2.Number :");
        b = inp.nextFloat();

        System.out.println("3.Number :");
        c = inp.nextFloat();

        if (a < b && a < c){
            if (b < c){
                System.out.println("a < b < c");}

                else {
                    System.out.println("a < c < b");}
        }
        else if(b < a && b < c) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        }

        else if (c < a && c < b) {
            if (a < b) {
                System.out.println("c < a < b");
            }   else{
                System.out.println("c < b < a");
            }
        }


    }

}
