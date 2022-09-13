
/*(c) If the marks obtained by a student in five different subjects are input through the keyboard,
write a program to find out the aggregate marks and percentage marks obtained by the
student. Assume that the maximum marks that can be obtained by a student in each subject is
100.
 */

package com.csi.core;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {

		System.out.println("please enter the marks of student in 4 subjects (PCMB)respectively");

		Scanner scanner = new Scanner(System.in);

		double p = scanner.nextInt();
		double c = scanner.nextInt();
		double m = scanner.nextInt();
		double b = scanner.nextInt();

		double totalmarks = 400;

		double total = p + c + m + b;
		double percentage = total / totalmarks * 100;

		System.out.println(" the percentage of student is:" + percentage);
		System.out.println(" your aggregate is (CGPA)" + percentage / 10);

	}

}
