
/*(d) Temperature of a city in Fahrenheit degrees is input through the keyboard. Write a program
to convert this temperature into Centigrade degrees.
 */
package com.csi.core;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {

		System.out.println("please enter the temperature of city in Fahrenheit");

		Scanner scanner = new Scanner(System.in);

		double farr = scanner.nextDouble();
		double cent = ((farr - 32) * 5) / 9;
		

		System.out.println("temperature in degree celsious is :" + cent);

	}

}

