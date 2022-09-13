package com.csi.core3;

public class ReverseNumber {
	
	 static int a=1565
			 ;
	
	static int b;
	
	public static void main(String[] args) {
		
		while (a>0) {
			
			b= a%10;
			a=a/10;
			
			System.out.print(b);
			// any digit numbeer will be reversed in this logic........ 
		}
		
	}

}
