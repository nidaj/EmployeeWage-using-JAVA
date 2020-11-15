import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class WageCalculator implements ICompany {
//	private int numOfCompany = 0;
	//private Company[] companyArray;
	private LinkedList<Company> companyLinkedList;
	private Map<String,Company> companyWageMap;
	
	public WageCalculator() {
		companyLinkedList =  new LinkedList<Company>();
		companyWageMap = new HashMap<String,Company>();
	}
	
	public void addCompany(int fullTime, int partTime,int workDays, String companyName) {
		Company companyObj  = new Company(fullTime, partTime,workDays, companyName);
		companyLinkedList.add(companyObj);
		companyWageMap.put(companyName,companyObj);
	}
	
	public void calculateWage() {
		for(int i=0; i<companyLinkedList.size(); i++) {
			Company companyObj = companyLinkedList.get(i);
			companyObj.setTotalWage(this.calculateWage(companyObj));
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
	 

