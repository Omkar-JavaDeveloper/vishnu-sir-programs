package com.csi.mockpractice;

import java.util.Iterator;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// threeDigitArmstrong();
		// anyDigitArmstrongByMathPowMethod();
		anyDigitArmstrongByLogic();

	}

	static void threeDigitArmstrong() {

		// get power of each digit in number as count of digit in number
		// and add each and compare it with original number

		int number = 153;
		int reference = number;
		int temp = 0, reminder;

		while (reference > 0) {
			reminder = reference % 10;
			temp = temp + (reminder * reminder * reminder);
			reference = reference / 10;
		}
		System.out.println("number::" + temp);

		if (temp == number) {
			System.out.println("it is armstrong number");
		} else {
			System.out.println("not a armstrong number");

		}
	}

	static void anyDigitArmstrongByMathPowMethod() {

		int anyNumber = 153;
		String lengthss = String.valueOf(anyNumber);
		int lengthOfNumber = lengthss.length();
		int reff = anyNumber;

		int tempo = 0, rem;

		while (reff > 0) {
			rem = reff % 10;
			tempo = (int) (tempo + (Math.pow(rem, lengthOfNumber)));
			reff = reff / 10;

		}
		if (tempo == anyNumber) {
			System.out.println("arm");

		} else {
			System.out.println("not");
		}
	}

	static void anyDigitArmstrongByLogic() {

		int anyNumber = 153;
		String lengthss = String.valueOf(anyNumber);
		int lengthOfNumber = lengthss.length();
		int reff = anyNumber;

		int tempo = 0, rem = 1;

		int vegla = 1;
		//int anyn = 1;
		while (anyNumber > 0) {
			rem = anyNumber % 10;
			

			for (int i = 1; i <= lengthOfNumber; i++) {

				vegla = rem * vegla;
			}
			tempo = tempo + vegla;
			reff = reff / 10;
		}
		System.out.println(tempo);

		if (tempo == anyNumber) {
			System.out.println("arm");

		} else {
			System.out.println("not");
		}

	}

}
