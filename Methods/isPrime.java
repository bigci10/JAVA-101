public class isPrime {

    static boolean isPrime(int n) {



        if (n <= 2) {
            return (n == 2) ? true : false;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(11));

    }
}
