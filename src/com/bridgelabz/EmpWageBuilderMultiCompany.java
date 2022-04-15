package com.bridgelabz;

/*
 * @author: Nikhil
 * Compute employee wage for Multiple company in procedural way using class methods
 */
public class EmpWageBuilderMultiCompany {
	// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	// class method
	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		// Declaring Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Employee Wage for Company " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	// main method
	public static void main(String[] args) {
		// Displaying welcome message
		System.out.println("Welcome to the Employee Wage Computation Programme");
		computeEmpWage("DMart", 20, 20, 100);
		computeEmpWage("Reliance", 25, 40, 150);
		computeEmpWage("Tata", 18, 30, 120);
	}
}