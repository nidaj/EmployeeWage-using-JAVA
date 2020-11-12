import java.util.Scanner;

public class Company {
	public static int fullTime;
	public static int partTime;
	public static int noWage;
	public static int workDays;
	public static String companyName;
	
	public static int getFullTime() {
		return fullTime;
	}


	public static void setFullTime(int fullTime) {
		Company.fullTime = fullTime;
	}


	public static int getPartTime() {
		return partTime;
	}


	public static void setPartTime(int partTime) {
		Company.partTime = partTime;
	}


	public static int getWorkDays() {
		return workDays;
	}
	
	public static String getCompanyName() {
		return companyName;
	}

	public static void setWorkDays(int workDays) {
		Company.workDays = workDays;
	}

	public static void setCompanyName(String companyName) {
		Company.companyName = companyName;
	}

	public void detailsCollector() {
		int f_w;
		int p_w;
		int days;
		String c;
		char ans='y';

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter The Company name");
			c = sc.next();
			Company.setCompanyName(c);
			System.out.println("\nEnter the Full time wage: ");
			f_w = sc.nextInt();
			Company.setFullTime(f_w);
			System.out.println("\nEnter the Part time wage: ");
			p_w = sc.nextInt();
			Company.setPartTime(p_w);
			System.out.println("\nEnter the Working days: ");
			days = sc.nextInt();
			Company.setWorkDays(days);
			Company.calculateWage();
			System.out.println("\nDo you want to continue for next company ");
			ans = sc.next().charAt(0);
		}while(ans=='y'||ans=='Y');
		sc.close();
		System.out.println("Thank you for using the Application");
	}
	
	
	public static void calculateWage() {
		WageCalculator obj = new WageCalculator() ;
		obj.calculate_wage();
	}
}
