package com.csi.mockpractice;

public class ReverseNumber {
	
     static int theNumber=156651;
	public static void main(String[] args) {
	
	int  tocheckPalindrome=	reversenumber(theNumber);
		
	System.out.println( checkPalindromOrNot(tocheckPalindrome)); 
	
	System.out.println("the reverse number of  "+ theNumber+"::"+reverseByTypeCasting(theNumber	)); 
	}
	
 static  int reversenumber ( int number) {
	  int rev=0;
	  int temp= number;
	  int reminder=0;
	  
	  while(number>0) {
		  reminder= number%10;
		  rev= rev*10+reminder;//54321
		  number=number/10;
		  
	  }
	  System.out.println(rev);
	  return rev;
  }
 
 static String checkPalindromOrNot(int number) {
	 
	 if (theNumber== number) {
		 return "yaay!! it is palindrome";
		
	}
	 return "Nooo!!! it is not ";
	 
	 
 }
	static int reverseByTypeCasting(int number2) {
		
		String numberString = String.valueOf(number2);
		String revString= "";
		
		for( int slength= numberString.length()-1;slength>=0;slength--) {
			revString= revString+numberString.charAt(slength);
			
		}
		int revereNum= Integer.parseInt(revString);
		
		return revereNum;
		
	}
	

}
