package oopsproblems;

public class EmployeeWageCompanys {
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	
	//public final String Company;
	public final int WagePerHour = 20;
	public final int NumberOfWorkingDays = 2;
	public final int TotalHoursinMonth = 10;;
	
	public static int EmployeeWageCompanys(String Company, int WagePerHour, int NumberOfWorkingDays, int TotalHoursinMonth) {
		/*
		this.Company = Company;
		this.WagePerHour = WagePerHour;
		this.NumberOfWorkingDays = NumberOfWorkingDays;
		this.TotalHoursinMonth = TotalHoursinMonth;
		*/
		 int numberOfHours = 0;
		 int empWagePerDay = 0;
		 int nHours=0;
	     int totalWorkDays = 0;
	     int totalWorkHours = 0;
		 int totalEmployeeWage =0;
		 
		while (totalWorkHours< TotalHoursinMonth && totalWorkDays <= NumberOfWorkingDays) {
			int isPresent = (int) Math.floor(Math.random()*10) %3;
			switch (isPresent) {
				case employeePresent :
					numberOfHours =8;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;
				case employeePartTime :
					numberOfHours =4;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;

				default :
					numberOfHours = 0;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;
					}

			}
			totalEmployeeWage= totalWorkHours * WagePerHour;
			System.out.println("Total Employee Wage for company : "+Company+" is "+ totalEmployeeWage);
		    return totalEmployeeWage;
	}
	
	 
	//Welcome Message
		public static void  Welcome() {
		System.out.println("Welcome to Employee Wage Computation program");
		}
}
