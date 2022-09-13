
/*(a) Ramesh’s basic salary is input through the keyboard. His dearness allowance is 40% of basic
salary, and house rent allowance is 20% of basic salary. Write a program to calculate his gross
salary.*/

package com.csi.core;

public class Salary {
	public static void main(String[] args) {

		int basic = 10000;
		double dallowence = basic * 0.4;
		double hrallowence = basic * 0.2;

		double grossSalary = basic + dallowence + hrallowence;
		int thegrossslary = (int) grossSalary;

		System.out.println("the gross salary is:" + thegrossslary);
	}

}
