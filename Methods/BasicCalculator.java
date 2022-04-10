import java.util.*;

public class BasicCalculator {
    static int result = 0;

    static int add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplamak istediğiniz sayı");
        int input = scanner.nextInt();
        return result += input;
    }

    static int divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bölmek istediğiniz sayı");
        int input = scanner.nextInt();
        return result /= input;
    }

    static int subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkartmak istediğiniz sayı");
        int input = scanner.nextInt();
        return result -= input;
    }

    static int multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çarpmak istediğiniz sayı");
        int input = scanner.nextInt();
        return result *= input;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        int select;
        do {

            if (counter == 0){
                System.out.println("Please enter the number");
                int first = sc.nextInt();
                result += first;
                counter ++;
            }

            System.out.println("1.'+'\n2.'-'\n3.'*'\n4.'/'\n0.'Exit'");
            select = sc.nextInt();
            switch (select) {

                case 1:
                    add();
                    System.out.println(result);
                    break;
                case 2:
                    subtract();
                    System.out.println(result);
                    break;
                case 3:
                    multiply();
                    System.out.println(result);
                    break;
                case 4:
                    divide();
                    System.out.println(result);
                    break;
                case 0:
                    System.out.println("Çıkış yapıldı");
                    System.out.println(result);
                    break;

            }
        } while (select != 0);
    }
}

