
/*(b) The distance between two cities (in km.) is input through the keyboard. Write a program to
convert and print this distance in meters, feet, inches and centimeters.
 */

package com.csi.core;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter distance between two cities:");

		double distancekm = scanner.nextDouble();
		double distancemeter = distancekm * 1000;
		double distancefeet = distancekm * 3280;
		double distanceinches = distancekm * 39370;
		double distancecm = distancekm * 100000;

		System.out.println("\n you enterred distance in km is :" + distancekm + "\n the distance in meter is:"
				+ distancemeter + "\n the distance in feet is:" + distancefeet + " \n the distance in inches is :"
				+ distanceinches + "\n the distance in cm is:" + distancecm);

	}

}
