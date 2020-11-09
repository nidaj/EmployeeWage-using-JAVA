import java.util.Random;
class EmployeeWage{
  public static void main(String[] args) {
	Random rand = new Random();
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	int attendance = rand.nextInt(2);
    	if(attendance==1){
      		System.out.println("Present");
    	}
    	else{
      		System.out.println("Absent");
    	}
  }
}
