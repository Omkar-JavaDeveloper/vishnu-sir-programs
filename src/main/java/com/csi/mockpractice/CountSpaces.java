package com.csi.mockpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CountSpaces {
	
	  public static void main(String[] args) {
		    String a="I am Omkar a b";
		    String r="";
		   
		    for(int i=0;i<a.length();i++)
		  {
		      if(Character.isSpace(a.charAt(i))){
		      
		      r=r+a.charAt(i);
		          
		      }
		  }
		 // System.out.print(r.length());
		    
		    
		    List<Integer> aList= Arrays.asList(1,5,9,3,4,4);
		    
		    System.out.println(aList);
		   
		    Collections.swap( aList, 1	, 5);
		    
		    System.out.println(aList);
		
		  
		    }
	  
	  
	

}
