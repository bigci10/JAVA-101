public class primeNumber {
    // Complete the solve function below.

    public static void main(String[] args){
        int number = 1000000;
        for (int i = 2; i <= number; i++){
            if (i % 2 == 0){
                System.out.println(i+"Is not a prime number");
            }
            else{
                System.out.println(i+"Prime Number");
            }

        }

    }
}
