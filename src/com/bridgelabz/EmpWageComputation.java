package com.bridgelabz;
/*
 * @author: Nikhil
 * Ability to manage Employee Wage of multiple companies using Interface approach
 */
public class EmpWageComputation implements EmpWageInterface {
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
 	//Insatnce variable
	private int numOfCompanies = 0;
	//constructor
	private CompanyEmpWage[] companyEmpWageArray;

	//constructor
	public EmpWageComputation() {
		companyEmpWageArray = new CompanyEmpWage[10];
	}

	//defining method using array
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		companyEmpWageArray[numOfCompanies] = new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays,
				maxHrsPerMonth);
		numOfCompanies++;
	}

	//calculating wages for multiple company
	public void empWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.print(companyEmpWageArray[i]);
		}
	}

	//Method to calculate employee wage
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		// Declaring Variables
		int totalEmpHour = 0;
		int empHour = 0;
		int totalWorkingDays = 0;
		// Computation
		while (totalEmpHour <= companyEmpWage.maxHrsPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			// Generating random numbers
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			// Switch case to check employee 
			switch (empCheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;

			case IS_PART_TIME:
				empHour = 4;
				break;

			default:
				empHour = 0;
			}
			totalEmpHour += empHour;
		}
		// Calculating Employee Wage
		return companyEmpWage.totalEmpWage = totalEmpHour * companyEmpWage.empRatePerHr;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program..!");
//		Creating instances of array to compute multiple companies wage structure
		EmpWageComputation companyEmpWageArray = new EmpWageComputation();
		companyEmpWageArray.addCompanyEmpWage("DMart", 20, 20, 100);
		companyEmpWageArray.addCompanyEmpWage("Reliance", 25, 40, 150);
		companyEmpWageArray.empWage();
	}
}