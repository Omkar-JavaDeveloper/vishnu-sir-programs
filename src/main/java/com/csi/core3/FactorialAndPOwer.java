package com.csi.core3;

public class FactorialAndPOwer {
	
	public static void main(String[] args) {		
			// two numbers are enred through keyboard, write program to
		//find the value od one number raise to power of another.
		
		
		int a = 5;
		int b = 2; 
		
		int mul = 1;

		for (int c=1; c <= b; c++) {

			mul =mul* a ; 

		}
		System.out.println(mul);
		
		
		// factorial
	
		   int z = 5, i = z; 
		  
		  int into = 1;
	  
	  for (z = i; z > 0; z--) {
	  
	  into =into * z;
	  
	 
	  
	   } 
	  
	  System.out.println(into);
	 }
}

