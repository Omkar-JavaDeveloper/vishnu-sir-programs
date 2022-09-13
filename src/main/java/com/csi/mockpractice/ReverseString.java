package com.csi.mockpractice;

public class ReverseString {

	public static void main(String[] args) {
		String samplesString="omkar";
		System.out.println(reversebyCharAt(samplesString));
		
		

	}

	static String reversebyCharAt(String sample) {
		
		String reverse = "";

		int slength = sample.length();

		for (int a = slength - 1; a >= 0; a--) {
			reverse = reverse + sample.charAt(a);

		}
		return reverse;
	}
	

}
