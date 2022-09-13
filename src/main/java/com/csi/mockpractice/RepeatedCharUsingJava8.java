package com.csi.mockpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedCharUsingJava8 {
	
	
	public static void main(String[] args) {
		List< Character> list= new ArrayList();
		 
		String string= "omkarkadamomkarkadam"; //omkard
		
		 char [] characters= string.toCharArray();
		 
		 for(Character c: characters) {	 
			 list.add(c);	 
		 }
		
	}

}
