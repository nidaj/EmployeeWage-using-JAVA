import java.util.Random;
class EmployeeWage{
  public static void main(String[] args) {
	int full_wage=160;
    	int no_wage=0; 
	Random rand = new Random();
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	int attendance = rand.nextInt(2);
    	if(attendance==1){
      		System.out.println("Wage= "+full_wage);
    	}
    	else{
      		System.out.println("wage= "+no_wage);
    	}
  }
}
