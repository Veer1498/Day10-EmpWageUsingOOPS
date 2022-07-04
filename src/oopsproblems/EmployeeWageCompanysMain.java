package oopsproblems;

public class EmployeeWageCompanysMain {
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	
	private int numOfCompany = 0;
	private EmployeeWageCompanys[] companyArray;
	
	public EmployeeWageCompanysMain() {
		companyArray = new EmployeeWageCompanys[3];
	}
	public static void main(String[] args) {
		
			EmployeeWageCompanysMain empwage =new EmployeeWageCompanysMain();
			empwage.Welcome();
			System.out.println("");
			empwage.addCompany("Amazon",32, 20,100);
			empwage.addCompany("FlipKart",24, 20,100);
			empwage.computeWage();
	}
	private void addCompany(String Company, int WagePerHour, int NumberOfWorkingDays, int TotalHoursinMonth) {
		companyArray [numOfCompany] = new EmployeeWageCompanys(Company, WagePerHour, NumberOfWorkingDays, TotalHoursinMonth);
		numOfCompany++;
	}
	//Welcome Message
			public void  Welcome() {
			System.out.println("Welcome to Employee Wage Computation program");
			}
	//
	private void computeWage() {
		for (int i=0; i< numOfCompany; i++) {
			companyArray[i].setTotalWage(computeWage(companyArray[i]));
			System.out.println(companyArray[i]);
		}
	}
	public static int computeWage(EmployeeWageCompanys EmployeeWageCompanys) {
		 int numberOfHours = 0;
		 int empWagePerDay = 0;
		 int nHours=0;
	     int totalWorkDays = 0;
	     int totalWorkHours = 0;
		 int totalEmployeeWage =0;
		 
		 while (totalWorkHours< EmployeeWageCompanys.getTotalHoursinMonth() && totalWorkDays < EmployeeWageCompanys.getNumberOfWorkingDays()) {
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
				totalEmployeeWage= totalWorkHours * EmployeeWageCompanys.getWagePerHour();
				System.out.println("");
				System.out.println("Total Employee Wage for Day"+totalWorkDays+" is "+ totalEmployeeWage);
			    return totalWorkHours*EmployeeWageCompanys.getWagePerHour();
	}
}
