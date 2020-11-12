import java.util.Random;

public class WageCalculator {
	 public void calculate_wage(){
		    int sum=0;
		    int attendance;
		    Random rand = new Random();
		    System.out.println("Employee Wage Calculation for "+ Company.getCompanyName());
		    System.out.println("Day\tWage\tSum");
		    for(int d=1;d<=Company.getWorkDays();d++){
		      attendance = rand.nextInt(3);
		      switch(attendance){
		      case 1:
		        sum=sum+Company.getFullTime();
		        System.out.println(d+"\t"+Company.getFullTime()+"\t"+sum);
		        break;
		      case 2 :
		        sum=sum+Company.getPartTime();
		        System.out.println(d+"\t"+Company.getPartTime()+"\t"+sum);
		        break;
		      case 0 :
		        sum=sum+Company.noWage;
		        System.out.println(d+"\t"+Company.noWage+"\t"+sum);
		      }
		    }
	 }
}
	 

