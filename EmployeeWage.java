import java.util.Random;
class EmployeeWage{
  public static void main(String[] args) {
	int full_wage=160;
	int part_time=80;
    	int no_wage=0; 
	Random rand = new Random();
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	int attendance = rand.nextInt(3);
    	switch(attendance){
	case 1: 
      		System.out.println("Wage= "+full_wage);
    		break;
    	case 2 :
      		System.out.println("Wage= "+part_time);
		break;
	case 0 :
		System.out.println("Wage= "+no_wage);
	}
  }
}
