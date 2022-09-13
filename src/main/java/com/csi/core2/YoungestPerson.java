package com.csi.core2;

import java.util.Scanner;

public class YoungestPerson {

	/*
	 * If the ages of Ram, Shyamand , Ajay are input through the keyboard, write a
	 * program to determine the youngest of the three.
	 */

	public static void main(String[] args) {

		do {

			System.out.println("please enter the age of : \n ram \n shyamand \n ajay ");

			Scanner scanner = new Scanner(System.in);

			int r = scanner.nextInt();// ram age
			int s = scanner.nextInt();// shyamand age
			int a = scanner.nextInt();// ajay age
			int result = ((r < s ? r : s) < a ? (r < s ? r : s) : a);

			if (r == result) {
				System.out.println("ram is youngest");
			} else if (s == result) {
				System.out.println("shyamand is youngest");
			} else {
				System.out.println("ajay is the youngest");
			}

		} while (true);
	}
}
