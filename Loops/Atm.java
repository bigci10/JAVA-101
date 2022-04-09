import java.util.Scanner;


public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username :");
            userName = sc.nextLine();
            System.out.print("Password : ");
            password = sc.nextLine();

            if (userName.equals("bigci10") && password.equals("12345")) {
                do {
                    System.out.println("Welcome to Kodluyoruz Bank \n1-Withdraw\n2-Deposit\n3-Balance\n4-Exit\nPlease Choose :");
                    select = sc.nextInt();


                    switch (select) {
                        case 1:
                            System.out.println("Amount for withdraw :");
                            int amount = sc.nextInt();
                            balance -= amount;
                            break;
                        case 2:
                            System.out.println("Amount for deposit :");
                            amount = sc.nextInt();
                            balance += amount;
                            break;
                        case 3:
                            System.out.println("Current Balance :" + balance);
                            ;
                    }
                } while (select != 4);
                System.out.println("Thanks");
                break;
            } else {
                right--;
                System.out.println("Username or password is wrong !!.");
                if (right == 0) {
                    System.out.println("Your account is blocked");
                }
            }
        }
    }
}
