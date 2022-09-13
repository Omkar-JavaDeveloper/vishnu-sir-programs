package com.csi.core3;

public class ReverseTheString {
	
	public static void main(String[] args) {

		
		String  string="omkar kadam";
		String rString="";
		for(int i=string.length()-1;i>=0;i--) {
			rString=rString+string.charAt(i);
		}
		System.out.println(rString);
		
		
	}
}
