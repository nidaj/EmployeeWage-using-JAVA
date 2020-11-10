import java.util.Random;
class EmployeeWage{
  static final int full_wage=160;
  static final int no_wage=0;
  static final int part_time=80;
  public void calculate_wage(){
    int sum=0;
    int attendance;
    Random rand = new Random();
    System.out.println("Day\tWage\tSum");
    for(int d=1;d<=20;d++){
      attendance = rand.nextInt(3);
      switch(attendance){
      case 1:
        sum=sum+full_wage;
        System.out.println(d+"\t"+full_wage+"\t"+sum);
        break;
      case 2 :
        sum=sum+part_time;
        System.out.println(d+"\t"+part_time+"\t"+sum);
        break;
      case 0 :
        sum=sum+no_wage;
        System.out.println(d+"\t"+no_wage+"\t"+sum);
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
    EmployeeWage obj = new EmployeeWage();
    obj.calculate_wage();
  }
}



