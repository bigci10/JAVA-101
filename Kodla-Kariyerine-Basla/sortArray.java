import java.util.*;


public class sortArray {
    public static void main(String[] args){


        System.out.println("Please enter array length :");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        String[] array = new String[len];


        for(int i=0;i<len;i++){
            array[i]= input.nextLine();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
    }
}
