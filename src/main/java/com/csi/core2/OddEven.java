package com.csi.core2;

import java.util.Scanner;

/*Any integer is input through the keyboard. Write a program to find out whether it
 *  is an odd number or even number.
 */
public class OddEven {

	public static void main(String[] args) {

		do {
            System.out.println("please enter no.");

			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();

			if (n % 2 == 0) {
				System.out.println(" this is a even no....");
			} else {
				System.out.println("it is a odd one!");
			}

		} while (true);
	}

}
