import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float number1 , number2 ;

        System.out.println("1.Number :");
        number1=s.nextFloat();

        System.out.println("2.Number :");
        number2=s.nextFloat();

        System.out.println("------------------------------------");
        System.out.println("---Calculator---\n1-Add\n2-Substract\n3-Divide\n4-Multiply");

        int choice = s.nextInt();


        switch (choice){
            case 1:
                System.out.println("Result ="+(number1+number2));
                break;
            case 2:
                System.out.println("Result ="+(number1-number2));
                break;
            case 3:
                System.out.println("Result ="+(number1/number2));
                break;
            case 4:
                System.out.println("Result ="+(number1*number2));
                break;
            default:
                System.out.println("Wrong Choice.\nTry Again");
                break;
        }

    }
}
