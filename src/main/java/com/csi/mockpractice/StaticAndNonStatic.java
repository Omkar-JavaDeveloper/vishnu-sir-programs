package com.csi.mockpractice;

public class StaticAndNonStatic {
	
	 int a=5;
	
	public static void main(String[] args) {
		
		StaticAndNonStatic o1= new StaticAndNonStatic();
		o1.a++;
		StaticAndNonStatic o2= new StaticAndNonStatic();
		o2.a++;
		StaticAndNonStatic o3= new StaticAndNonStatic();
		o3.a++;
		StaticAndNonStatic o4= new StaticAndNonStatic();
		o4.a++;
		StaticAndNonStatic o5= new StaticAndNonStatic();
		o5.a++;
		
		System.out.println(o3.a);

	}

}
