package oopsproblems;

public class EmployeeWageCompanys {
	
	
	private String Company;
	private int WagePerHour;
	private int NumberOfWorkingDays;
	private int TotalHoursinMonth;
	private int totalWage;
	
	public  EmployeeWageCompanys(String Company, int WagePerHour, int NumberOfWorkingDays, int TotalHoursinMonth) {
	
		this.Company = Company;
		this.WagePerHour = WagePerHour;
		this.NumberOfWorkingDays = NumberOfWorkingDays;
		this.TotalHoursinMonth = TotalHoursinMonth;
		
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getWagePerHour() {
		return WagePerHour;
	}
	public void setWagePerHour(int wagePerHour) {
		WagePerHour = wagePerHour;
	}
	public int getNumberOfWorkingDays() {
		return NumberOfWorkingDays;
	}
	public void setNumberOfWorkingDays(int numberOfWorkingDays) {
		NumberOfWorkingDays = numberOfWorkingDays;
	}
	public int getTotalHoursinMonth() {
		return TotalHoursinMonth;
	}
	public void setTotalHoursinMonth(int totalHoursinMonth) {
		TotalHoursinMonth = totalHoursinMonth;
	}
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	@Override
	public String toString() {
		return "[Company= " + Company + ", WagePerHour= " + WagePerHour + ", NumberOfWorkingDays= "
				+ NumberOfWorkingDays + ", TotalHoursinMonth= " + TotalHoursinMonth
				+"]";
		
	}
	
	
}
