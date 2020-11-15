import java.util.Scanner;

public class Company {
	public final int fullTime;
	public final int partTime;
	public final int workDays;
	public final String companyName;
	public int totalWage;
	
	
	
	public Company(int fullTime, int partTime,int workDays, String companyName) {
		this.fullTime = fullTime;
		this.partTime = partTime;
		this.workDays = workDays;
		this.companyName = companyName;
	}
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String toString(){
		return " Employees Total Wage for the Company: " + companyName + " = " +totalWage ;  
	}
}
