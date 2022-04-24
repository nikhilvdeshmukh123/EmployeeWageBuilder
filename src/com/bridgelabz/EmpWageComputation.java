package com.bridgelabz;

import java.util.ArrayList;
/*
 * @author: Nikhil
 * Refactor to have list of multiple companies to manage Employee Wage
 */
public class EmpWageComputation implements EmpWageInterface {
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
 	//ArrayList
	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
	//object of constructor
	public EmpWageComputation() {
		super();
		companyEmpWageArrayList = new ArrayList<CompanyEmpWage>();
	}
	//defining method using array
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		CompanyEmpWage companywage = new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays,maxHrsPerMonth);
		companyEmpWageArrayList.add(companywage);
	}

	//calculating wages for multiple company
	public void empWage() {
		for (int i = 0; i < companyEmpWageArrayList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
			
			int totalEmpWage = this.computeEmpWage(companyEmpWage);
			System.out.println("Total Employee Wage for Company " + companyEmpWage.company + " is: " + totalEmpWage);
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