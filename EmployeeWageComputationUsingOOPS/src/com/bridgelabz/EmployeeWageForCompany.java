/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author Dell
 *
 */
public class EmployeeWageForCompany {

	private int wagePerHr;
	private int totalDays;
	private int totalHrs;
	
	EmployeeWageForCompany(int wage, int days, int hrs){
		this.wagePerHr = wage;
		this.totalDays = days;
		this.totalHrs = hrs;
	}
    
    Random randomObj = new Random();

    public void calculateEmployeeWage(){
        int workingHrs = 0;
        int workingDays = 0;
        int salary;
        while (workingHrs < totalHrs && workingDays < totalDays){
        	int attendance = randomObj.nextInt(3);
        	
			if(attendance==0) {
				workingHrs+=8;			
			}
			else if(attendance==1){
				workingHrs+=4;
			}
			else {
				workingHrs+=0;
			}

        }
        salary = workingHrs*wagePerHr;
        System.out.println("Salary of employee for "+totalDays+" days / "+ totalHrs+" hours  = "+salary);
    }

    public static void main(String[] args) {
        
    	EmployeeWageForCompany employeeObj1 = new EmployeeWageForCompany(30,30,150);
    	System.out.println("Salary of Employee for company1");
        employeeObj1.calculateEmployeeWage();

        EmployeeWageForCompany employeeObj2 = new EmployeeWageForCompany(25,30,100);
        System.out.println("\nSalary of Employee for company2");
        employeeObj2.calculateEmployeeWage();
    }

}
