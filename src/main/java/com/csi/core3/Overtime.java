package com.csi.core3;

import java.util.Scanner;

public class Overtime {

	/*
	 * Write a program to calculate overtime pay of 10 employees. Overtime is paid
	 * at the rate of Rs. 12.00 per hour for every hour worked above 40 hours.
	 * Assume that employees do not work for fractional part of an hour.
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(" please enter working hr of employee:" + i);

			Scanner scanner = new Scanner(System.in);

			int emphr = scanner.nextInt();

			System.out.println((emphr <= 40) ? "not applicable for overtime" : "applicable for overtime");

			if (emphr > 40) {
				System.out.println(
						"OT hrs of empl:" + i + "is:" + ((emphr - 40) + " hr & payable amt is:") + ((emphr - 40) * 12));

			}

		}

	}
}

/*
 * do { System.out.
 * println("please enter the \n 1.employee name: \n 2. employee working hr:");
 * 
 * Scanner scanner= new Scanner(System.in);
 * 
 * String empname = scanner.nextLine();
 * 
 * int emphr= scanner.nextInt();
 * 
 * System.out.println((emphr<40)? "not applicable for overtime" :
 * "applicable for overtime"); }
 * 
 * while(emphr>40) {
 * 
 * System.out.println("overtime hours of employee:"+ empname+ "is:"+
 * ((emphr-40)+"and payable ammount is:")+ ((emphr-40)*12)); break; }
 */
