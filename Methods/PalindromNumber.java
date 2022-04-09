public class Palindrome {
    public static void main(String[] args) {

        isPalindrome(334);

    }

    static void isPalindrome(int Number) {
        String number = String.valueOf(Number);
        String str = "";

        for (int i = number.length() - 1; i >= 0; i--){

            String x = String.valueOf((number.charAt(i)));
            str += x;
        }

        if (str.equals(number)) {
            System.out.println(number + " is Polindrom Number.");
        }
        else {
            System.out.println(number + " is Not Polindrom Number.");
        }

    }
}
