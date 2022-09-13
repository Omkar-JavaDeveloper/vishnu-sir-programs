package com.csi.core;

import java.util.Scanner;

public class RectangleCircle {

	/*
	 * (e) The length and breadth of a rectangle and radius of a circle are input
	 * through the keyboard. Write a program to calculate the area and perimeter of
	 * the rectangle, and the area and circumference of the circle
	 */

	public static void main(String[] args) {

		do {

			System.out.println(
					" please enter your choise of calculation\n 1. area and perimeter of rectangle \n 2. area and circumference of circle");

			Scanner scanner = new Scanner(System.in);

			int ch = scanner.nextInt();

			switch (ch) {
			case 1: // rectangle
				System.out.println("\n please enter the length and width of rectangle");
				int length = scanner.nextInt();
				int breadth = scanner.nextInt();

				System.out.println("\n area of rectangle is :" + (length * breadth) + "\n perimeter of rectangle is:"
						+ (length + length + breadth + breadth));

				break;
			case 2: // circle

				System.out.println("please enter radius of circle");
				Double radius = scanner.nextDouble();

				System.out.println("\n area of circle is :" + (3.14 * (radius * radius))
						+ "\n circumference of rectangle is:" + (2 * 3.14 * radius));

				break;

			default:
				System.out.println("invalid choice");
				break;
			}
		} while (true);

	}

}
