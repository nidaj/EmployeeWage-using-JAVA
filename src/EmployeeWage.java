
public class EmployeeWage {

	public static void main(String[] args) {
		WageCalculator calcObj = new WageCalculator();
		calcObj.addCompany(160, 80 , 20 , "Dmart");
		calcObj.addCompany(200, 100 , 26 , "VijaySales");
		calcObj.calculateWage();
	}

}