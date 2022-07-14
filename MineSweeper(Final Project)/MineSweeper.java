import java.util.Random;
import java.util.Scanner;

public class MineSweepeer {
  private int rowsize;
  private int columnsize;
  String[][] sweeper = new String[rowsize][columnsize];
  String[][] sweeper2 = new String[rowsize][columnsize];
  
  public MineSweepeer(int rowsize,int columnsize){
    this.rowsize = rowsize;
    this.columnsize = columnsize;
    this.sweeper = new String[rowsize][columnsize];
    this.sweeper2 = new String[rowsize][columnsize];
  }
  private String[][] createcleanSweeper() {
    for (int i = 0; i < sweeper2.length; i++) {
      for (int j = 0; j < sweeper2[1].length; j++) {
        sweeper2[i][j] = "-";
      }
    }
    return sweeper2;
  }
  
  public String[][] createSweeper(){
    System.out.println("MineSweeper Is Created..");
    Random rand = new Random();
    int rowsweep1 = rand.nextInt(rowsize-1);
    int columnsweep1 = rand.nextInt(columnsize-1);
    int rowsweep2 = rand.nextInt(rowsize-1);
    int columnsweep2 = rand.nextInt(columnsize-1);
    
    sweeper[columnsweep1][rowsweep1] = "*";
    sweeper[columnsweep2][rowsweep2] = "*";
    
    for(int i = 0 ; i < sweeper.length;i++){
      for(int j = 0; j < sweeper[1].length;j++){
        if (sweeper[i][j] != "*"){
          sweeper[i][j] = "-";
        }
      }
    }
    pprint(sweeper);
    createcleanSweeper();
    
    return sweeper;
  }
    private void pprint(String[][] str){
        for(int i = 0 ; i < str.length;i++) {
            for (int j = 0; j < str[1].length; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
  
  public String[][] play() {
    Scanner sc = new Scanner(System.in);
    int length = 0;
    while(sweeper.length > length){
      System.out.println("Please enter the row :");
      int row = sc.nextInt();
      System.out.println("Please enter the column :");
      int column = sc.nextInt();
      
      if (sweeper[row][column] != "*") {
        sweeper2[row][column] = "1";
        pprint(sweeper2);
      }
      else if(sweeper[row][column] == "*"){
        System.out.println("Game Over");
        pprint(sweeper);
        break;}
      
      else{
        System.out.println("You're the Winnerr..");
      }
    }
    return sweeper;
  }
}
