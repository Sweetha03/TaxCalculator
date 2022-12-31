package Salary;

import java.util.Scanner;

public class TaxCalculator {
	
	public static void main(String xyz[])
	   {		   
		   Scanner scanner = new Scanner(System.in);
		   
		System.out.print("Enter Salary :- ");
		int salary = scanner.nextInt();
	    float tax = 1;
	    double hra;
	    double da;
	    hra = 0.15*salary;
	    da = 0.60*salary;
		int taxRate = 0;
		if(salary>500000 && salary<=1000000)
		{
			tax = (float) (salary*0.20);
		}
		if(salary>1000000) 
		{
			tax = (float) (salary*0.30);
		}
		if(salary<500000)
		{
			tax = 0;
		}
		
		double totalSalary = ((salary+hra+da)-tax);
		System.out.println(hra);
		System.out.println(da);
		System.out.println(totalSalary);
		System.out.println(tax);
	
	   }
}
