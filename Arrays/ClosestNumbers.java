import java.util.*;

public class FindClosestNumbers {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,-87,7,8,1,2};

        findClosest(numbers,6);

    }



    static void findClosest(Integer[] number,int input) {
        int min = 0;
        int max = 0;


        for (Integer i : number) {
            if (i > max) {
                max = i;
            }
        }

        for (Integer num : number) {
            if ((num < input) & (num > min)) {
                min = num;
            }


            if ((num > input) & (num < max)) {
                max = num;
            }
        }
        System.out.println("Lower closest number is " + min);
        System.out.println("Higher closest number is " + max);

    }
}
