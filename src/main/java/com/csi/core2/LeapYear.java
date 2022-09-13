package com.csi.core2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		do {
			System.out.println("please enter year.");

			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();

			if (n % 4 == 0) {
				System.out.println(" this is a leap....");
			} else {
				System.out.println("it is not a leap year!");
			}

		} while (true);
	}

}
