package com.csi.core;

// write a program to get if year is leap or not

public class LeapYear {
	public static void main(String[] args) {
		
		int year = 3000 ;
		
		if ( year%400==0 || (year %4==0 &&  year%100!=0 )) {
			
			System.out.println("it is a leap year!!");
		} else {
			System.out.println("it is not a leap year!!");
		}
	}

}
