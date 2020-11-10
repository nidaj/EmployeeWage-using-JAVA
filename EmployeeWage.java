import java.util.Random;
class EmployeeWage{
  public static void main(String[] args) {
        int full_wage=160;
        int part_time=80;
        int no_wage=0;
	int sum=0;
        Random rand = new Random();
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int attendance;
        System.out.println("Days\tWage\tsum");
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
}
