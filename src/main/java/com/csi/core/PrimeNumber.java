package com.csi.core;

import javax.sql.rowset.JoinRowSet;

public class PrimeNumber {

	public static void main(String[] args) {

		int a=13;

		boolean flag=false;
		for (int i=2;i<= a/2;++i) {
			if (a%i==0) {

				flag= true;
				break;
			}
	}
		if (!flag) {
			System.out.println("prime no.");
		} else {
			System.out.println("not ");

		}	
	}
}
