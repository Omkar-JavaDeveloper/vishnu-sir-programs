package com.csi.mockpractice;

public class PrimeNumbers {
	
    
	public static void main(String[] args) {
		
		int number= 68;
		int count=0;
		
		for(int i=2;i<=number-1;i++) {
			
			if (number%i==0) {
				count++;}
			
		}
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
}
