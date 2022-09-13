package com.csi.core2;

import java.util.Scanner;

public class AbsoluteValue {
	/*
	 * Write a program to find the absolute value of a number entered through the
	 * keyboard.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		if (n < 0) {
			System.out.println(" absolute value is : " + (0 - n));

		} else {
			System.out.println("absolute value:" + n);
		}

	}
}
