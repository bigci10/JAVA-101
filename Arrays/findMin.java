import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the list size");
    int listsize = sc.nextInt();
    
    Integer[] list = new Integer[listsize];

    int i = 0;
    while(i < listsize){
      System.out.println("Please enter the "+i+".number");
      int number = sc.nextInt();
      list[i] = number;
      i++;
    }
    
    boolean start = false;
    int min = 0;
    
    for(int w = 0; w < list.length;w++){
      for (int j = w; j < list.length;j++){
        
        if (start == false){
          min = list[w];
          start = true;
        }
        else{
          boolean b = list[j] < min;
          if (b == true){
            min = list[j];
          }
        }
      }
    }
        System.out.println(min);
  }
}
