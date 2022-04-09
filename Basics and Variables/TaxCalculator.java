import java.util.Scanner;
public class Tax {
  
  public static void main(String[] args) {
      
      float no_vat,with_vat;
      Scanner inp = new Scanner(System.in);

      System.out.print("Please Enter Product Main Price: "); //Main price meaning is "without tax"
        
      no_vat = inp.nextFloat();
      with_vat = ((no_vat*18)/100f)+no_vat;

      System.out.println("Product WithVat Price: "+with_vat);
      System.out.println("Product Vat amount: "+(with_vat-no_vat));
    }
}
