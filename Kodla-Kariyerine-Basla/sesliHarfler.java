import java.util.*;


public class sesliHarfler {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sesliler= "aeıioöuü";

        System.out.println("Please enter text :");
        String text = input.nextLine();

        for (int i = 0;i<=text.length()-1;i++){
            for(int j= 0 ; j<=7;j++){
                if(text.charAt(i)==sesliler.charAt(j)){
                    System.out.println(text.charAt(i));
                }
            }
        }

    }
}
