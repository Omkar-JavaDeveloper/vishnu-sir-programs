package com.csi.core2;

import java.util.Scanner;

public class Triangle {

	/*
	 * Write a program to check whether a triangle is valid or not, when the three
	 * angles of the triangle are entered through the keyboard. A triangle is valid
	 * if the sum of all the three angles is equal to 180 degrees.
	 */

	public static void main(String[] args) {
		
		System.out.println("please enter three angles");
		Scanner scanner = new Scanner(System.in);

		int angle1 = scanner.nextInt();
		int angle2 = scanner.nextInt();
		int angle3 = scanner.nextInt();

		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("valid triangle ");
		} else {
			System.out.println("invalid triangle");
		}

	}
}
