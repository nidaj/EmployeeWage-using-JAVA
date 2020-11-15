import java.util.Random;

public class WageCalculator {
	private int numOfCompany = 0;
	private Company[] companyArray;
	
	public WageCalculator() {
		companyArray =  new Company[5];
	}
	
	public void addCompany(int fullTime, int partTime,int workDays, String companyName) {
		companyArray[numOfCompany] = new Company(fullTime, partTime,workDays, companyName);
		numOfCompany++;
	}
	
	public void calculateWage() {
		for(int i=0; i < numOfCompany; i++ ) {
			companyArray[i].setTotalWage(this.calculateWage(companyArray[i]));
			System.out.println(companyArray[i]);
		}
	}
	public int calculateWage(Company Company){
		    int attendance,sum=0;
		    Random rand = new Random();
		    for(int d=1;d<=Company.workDays ;d++){
		      attendance = rand.nextInt(3);
		      switch(attendance){
		      case 1:
		        sum=sum+Company.fullTime;
		        System.out.println(d+"\t"+Company.fullTime+"\t"+sum);
		        break;
		      case 2 :
		        sum=sum+Company.partTime;
		        System.out.println(d+"\t"+Company.partTime+"\t"+sum);
		        break;
		      case 0 :
		        sum=sum+0;
		        System.out.println(d+"\t"+"0"+"\t"+sum);
		      }
		    }
		    return sum;
	 }
}
	 

