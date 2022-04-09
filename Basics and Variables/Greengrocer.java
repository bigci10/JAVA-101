import java.util.Scanner;


public class Greengrocer {
    public static void main(String[] args) {
        float apple, pear, banana, aubergine, tomato;
        int choice, vault;

        vault = 0;

        Scanner inp = new Scanner(System.in);

        int whilenumber = 1;
        while(whilenumber == 1) {
            System.out.println("Welcome.\nFruits and Vegetables:\n1-Apple(3,67 TL)\n2-Pear(2,14 TL)\n3-Banana(0,95 TL)\n" +
                    "4-Aubergine(5,00 TL)\n5-Tomato(1,11 TL)\n" +
                    "6-Exit\n"+"Please select :");
            choice = inp.nextInt();
            if (choice == 1) {

                System.out.println("Amount : (KG) ");
                int amount = inp.nextInt();
                vault += (amount * 3.67);
                System.out.println("Cost "+vault+" TL");
            } else if (choice == 2) {

                System.out.println("Amount : (KG) ");
                int amount = inp.nextInt();
                vault += (amount * 2.14);
                System.out.println("Cost "+vault+" TL");
            } else if (choice == 3) {

                System.out.println("Amount : (KG) ");
                int amount = inp.nextInt();
                vault += (amount * 0.95);
                System.out.println("Cost "+vault+" TL");

            } else if (choice == 4) {

                System.out.println("Amount : (KG) ");
                int amount = inp.nextInt();
                vault += (amount * 5.00);
                System.out.println("Total Cost "+vault+" TL");
            } else if (choice == 5) {
                System.out.println("Amount : (KG) ");
                int amount = inp.nextInt();
                vault += (amount * 1.11);
                System.out.println("Cost "+vault+" TL");
            } else {
                whilenumber = 2;

        }




        }
        System.out.println("\n\nTotal Cost: "+vault+ "TL");
    }
}
