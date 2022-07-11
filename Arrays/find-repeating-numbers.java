public class Main {
  
  public static void main(String[] args) {
    
    int[] numbers = {1,2,3,4,4,5,6,7,8,2,4};
    int numm;
    
    for(Integer num : numbers){
      if (num % 2 == 0){
        numm = num;
        
        for (int i = num+1 ; i < numbers.length;i++){
          boolean b = numbers[i] == numm;
          if (b == true){
            System.out.print(numm);
            System.out.print(" ");
          }
        }
      }
    }
  }
}
