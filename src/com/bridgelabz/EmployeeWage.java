package com.bridgelabz;
/*
 * @author: Nikhil
 * Compute employee wage using class methods
 */
public class EmployeeWage {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	// class method
	public static int computeEmpWage() {
		//Declaring Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			//Generating random numbers
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
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage: " + totalEmpWage);
		return totalEmpWage;
	}
	//main method
	public static void main(String[] args) {
		//Displaying welcome message 
		System.out.println("Welcome to the Employee Wage Computation Programme");
		computeEmpWage();
	}
}