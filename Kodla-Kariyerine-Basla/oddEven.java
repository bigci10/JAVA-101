import java.util.*;


public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac = 0;

        Integer[] array = new Integer[10];
        Random rand = new Random();


        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt();
            if (array[i] % 2 == 0){
                sayac ++;
            }
        }
        System.out.println("Total Odd :"+sayac+"\nTotal Even :"+(10-sayac));

    }

}
