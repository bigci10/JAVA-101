import java.util.*;
//Write a program that finds the largest and smallest numbers from N counting numbers entered 


public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list=new ArrayList<Integer>();

        while(n > 0){
            int k = sc.nextInt();
            list.add(k);
            n --;
        }
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }

}
