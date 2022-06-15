import java.util.Random;

public class Fighter {
  
  private String name;
  private int weight;
  private int power;
  private int health = 100;

  Fighter(String name,int weight,int power){
    
    this.name = name;
    this.weight = weight;
    this.power = power;
  }
  
  public int Punch(){
    
    Random rnd = new Random();
    int punch = rnd.nextInt(this.getPower());
    
    return punch;
   }


  public int getPower() {
    
    return power;
  }
  
  public String getName() {
    
    return this.name;
  }
  
  public void setPower(int power) {
    
    this.power = power;
  }
  
  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

}
