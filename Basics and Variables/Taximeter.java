import java.util.Scanner;
public class Taximeter {

    public static void main(String[] args) {
        // write your code here
        double opening,perkm,totalcost;
        int totalkm;

        opening = 10.0;
        perkm = 2.20;

        Scanner input= new Scanner(System.in);

        System.out.println("----TAXIMETER----");


        System.out.print("How many kilometers did you drive in total? : ");
        totalkm=input.nextInt();

        totalcost=opening+(totalkm*perkm);

        if(totalkm < 20){
            totalcost = 20;
            }


        System.out.println("Total Cost: "+totalcost);
    }
}
