public class Main {
  public static void main(String[] args) {
    
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
    
    for (int i = 0; i < array[0].length;i++){
      for(int j = 0; j < array.length;j++)
        System.out.print(" "+array[j][i]+" ");
      System.out.println("");
    }
  }
}
