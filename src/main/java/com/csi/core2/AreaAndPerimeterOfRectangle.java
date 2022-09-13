package com.csi.core2;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {

		System.out.println("please enter the leamgth and breadth below:");

		Scanner scanner = new Scanner(System.in);

		int l = scanner.nextInt();
		int b = scanner.nextInt();

		int area = l * b;
		int perimeter = l * 2 + b * 2;

		if (area > perimeter) {
			System.out.println("area is greater than perimeter" + "\n area:" + area + " \n perimeter:" + perimeter);

		} else {
			System.out.println("area is less than perimeter" + "\n area:" + area + " \n perimeter:" + perimeter);
		}
	}

}
