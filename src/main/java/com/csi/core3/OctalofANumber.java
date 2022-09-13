package com.csi.core3;

import java.util.Scanner;

// find octal value of given integer value!

public class OctalofANumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter the integer");
		int a = scanner.nextInt();
	    int count=0;
		while(a>0) {
			a=(a/10);
			count++;
		} 
		System.out.println(count);
		int[] store = new int[count];
		int q = 0, o = 0;
		int r = 0;

		while (a > 0) { // 1792 //224

			q = a / 8; // 224 // 28
			store[r] = a % 8; // 0, 0
			a = q; // 224 // 28

			r++;

		}

		for (int b = (store.length) - 1; b >= 0; b--) {

			System.out.print(store[b]);
		}

	}
}
