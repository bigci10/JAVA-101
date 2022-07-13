import java.util.Arrays;

public class Main {
  
  public static void main(String[] args) {
    int [] myList =  {10, 20, 20, 10, 10, 20, 5, 20};
    
    for(int i = 0; i < myList.length;i++){
      int sayac = 1;
      for(int j = i+1 ; j < myList.length;j++){
        if (myList[i] == myList[j]){
          sayac ++;
          myList[j] = -999999;
        }
      }
      if (myList[i] != -999999){
        System.out.println(myList[i]+" sayısı "+sayac+" kere tekrar edildi.");
      }
    }

  }
}
