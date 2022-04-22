package com.bridgelabz;
/*
 * @author: Nikhil
 * Ability to save the Total Wage for Each Company 
 */
public class EmpWageBuilder {
	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	// Instance variables
	private final String company;
	private final int emp_Wage_Per_Hr;
	private final int max_Working_Days;
	private final int maxHr_In_Month;

	// Parameterised constructor
	public EmpWageBuilder(String company, int emp_Wage_Per_Hr, int max_Working_Days, int maxHr_In_Month) {
		this.company = company;
		this.emp_Wage_Per_Hr = emp_Wage_Per_Hr;
		this.max_Working_Days = max_Working_Days;
		this.maxHr_In_Month = maxHr_In_Month;
	}

	// class method to calculate Employee Wage
	public void computeEmpWage() {
		// Declaring Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHr_In_Month && totalWorkingDays < max_Working_Days) {
			totalWorkingDays++;
			// Generating random numbers
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			// Switch case
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp hr: " + empHrs);
		}
		// Calculating Employee Wage
		int totalEmpWage = totalEmpHrs * emp_Wage_Per_Hr;
		System.out.println("Total Employee Wage for Company " + company + " is: " + totalEmpWage);
	}

	@Override
	public String toString() {
		return "EmpWageBuilder [Company = " + company + ", emp_Wage_Per_Hr = " + emp_Wage_Per_Hr
				+ ", max_Working_Days = " + max_Working_Days + ", maxHr_In_Month = " + maxHr_In_Month + "]";
	}

	// main method
	public static void main(String[] args) {
		// Displaying welcome message
		System.out.println("Welcome to the Employee Wage Computation Programme");
		// Initialisation Of company name with parameter
		EmpWageBuilder dMart = new EmpWageBuilder("DMart", 20, 20, 100);
		EmpWageBuilder reliance = new EmpWageBuilder("Reliance", 25, 40, 150);

		// Calling method with Company reference name
		dMart.computeEmpWage();
		System.out.println(dMart);
		System.out.println();
		
		reliance.computeEmpWage();
		System.out.println(reliance);
	}

}