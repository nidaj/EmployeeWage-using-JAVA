import java.util.Random;
class EmployeeWage{
  public static void main(String[] args) {
	int full_wage=160;
    	int no_wage=0; 
	int part_time=80;
	Random rand = new Random();
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	int attendance = rand.nextInt(3);
    	if(attendance==1){
      		System.out.println("Wage= "+full_wage);
    	}
    	else if(attendance==2){
      		System.out.println("wage= "+part_time);
    	}
	else{
		 System.out.println("wage= "+no_wage);
	}
  }
}
