import java.util.Random;
class EmployeeWage{
  public static void main(String[] args) {
        int full_wage=160;
        int part_time=80;
        int no_wage=0;
        Random rand = new Random();
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int attendance;
        System.out.println("Days\tWage");
        for(int d=1;d<=20;d++){
          attendance = rand.nextInt(3);
          switch(attendance){
          case 1:
                System.out.println(d+"\t\t"+full_wage);
                break;
          case 2 :
                System.out.println(d+"\t\t"+part_time);
                break;
          case 0 :
                System.out.println(d+"\t\t"+no_wage);
          }

        }
  }
}
