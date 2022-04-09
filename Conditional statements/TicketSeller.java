import java.util.*;


public class TicketSeller {

    public static void main(String[] args) {
        int distance, age, type;
        double distanceprice = 0,agediscount = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Type of flight \n1-One Way\n2-Return");
        type = input.nextInt();
        if (type > 2 || type < 1) {
            System.out.println("Error please choose 1 or 2 ");
        } else {
            System.out.println("Please enter the distance (km)");
            distance = input.nextInt();
            if (distance <= 0) {
                System.out.println("Error please enter km +0");
            }
            else {
                ;
            }

            System.out.println("Please enter age");
            age = input.nextInt();
            if (age <= 0) {
                System.out.println("Error please enter age >=0");
            }
            else {
                distanceprice = (distance*0.35)+50;
                if (age < 12){
                    agediscount += ((distanceprice * 0.5)*0.1);
                }
                else if (age >= 12 && age <= 24){
                    agediscount = (distanceprice * 0.9);
                }
                else if (age > 65){
                    agediscount = (distanceprice * 0.3);
                }
                else {
                    if (type == 2){
                        agediscount = (distanceprice * 0.2);
                    }
                }
            }

            System.out.println("Toplam Tutar"+agediscount+"TL");
        }
    }
}
