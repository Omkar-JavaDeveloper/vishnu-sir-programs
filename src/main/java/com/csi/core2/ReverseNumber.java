package com.csi.core2;

import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

/*A five-digit number is entered through the keyboard. 
 * Write a program to obtain the reversed number and to determine
 *  whether the original and reversed numbers are equal or not.
*/
public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int n = scanner.nextInt();  // 12345
		int o=n;
		
		int a,b,c,d,e;
		a=n%10;
		n=n/10;
		b=n%10;
		n=n/10;
		c=n%10;
		n=n/10;
		d=n%10;
		n=n/10;
		e=n%10;
		int m=a*10000 + b*1000+ c*100 + d*10 + e;
		// 50000 + 4000+ 300+20+1
		System.out.println( o==m ? "Palindrome": "Not Palindrome" );
		
	}
	
}
