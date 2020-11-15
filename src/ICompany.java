
public interface ICompany {
	public void addCompany(int fullTime, int partTime,int workDays, String companyName);
	public void calculateWage();
	public int getTotalWage(String companyName); 

}
