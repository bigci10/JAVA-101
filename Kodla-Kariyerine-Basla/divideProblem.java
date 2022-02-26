import java.util.*;


public class Test {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        System.out.println("Please enter the number :");
        
        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 && i % 7 == 0){
                System.out.println(i+" This number can divide 3 and 7");
            }
            else{
                System.out.println(i+" This number can't divide 3 and 7");
            }

        }

    }
}
