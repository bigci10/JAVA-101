public class expForPositiveInt {

    static double ExpCalc(int number, int exp) {
        int counter = 1;
        int total = 1;
        

        while (exp >= counter){
            counter++;
            total *= number;
        }
        return total;

    }

    public static void main(String[] args) {
        System.out.println(ExpCalc(3,0));
    }
}
