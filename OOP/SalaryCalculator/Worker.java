public class Worker {
  
  private String name ;
  private double salary;
  private int workHours;
  private int hireYear;

  
  Worker(String name,int salary,int workHours,int hireYear){

    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getWorkHours() {
    return workHours;
  }

  public void setWorkHours(int workHours) {
    this.workHours = workHours;
  }

  public int getHireYear() {
    return hireYear;
  }

  public void setHireYear(int hireYear) {
    this.hireYear = hireYear;
  }

  public double Tax(){
    if (this.salary > 1000){
      this.salary = (this.salary-(this.salary * 0.03));
      System.out.println("Tax fees taked.");
    }
    return salary ;
  }
  
  public double Bonus(){
    
    if (getWorkHours() > 40){
      int calc = (getWorkHours() - 40) * 30;
      this.salary = this.salary + calc;
    }
    return this.salary;
  }

  public double raiseSalary(){
    if (this.hireYear < 10){
      this.salary = this.salary + (this.salary * 0.05);
    }
    else if (this.hireYear > 9 & this.hireYear < 20){
      this.salary = this.salary + (this.salary * 0.10);
    }
    
    else {
      this.salary = this.salary + (this.salary * 0.15);
    }
    return salary;
  }
  private void Checkbox(){
    raiseSalary();
    Bonus();
    Tax();
  }
  
  @Override
  public String toString() {
    Checkbox();
    return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
