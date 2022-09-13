package CodeAskedIniterviews;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapInternal {

	

	
	public static void main(String[] args) throws NullPointerException {
		
		String aaString= "A";
	System.out.println(	aaString.hashCode());
		
		Map<String,String> ssMap= new HashMap<String,String>();
		Map<String,String> st= new TreeMap<String,String>();
		

	st.put("1", "A");
	
		
	/*
	 * ssMap.put(null, "A"); ssMap.put(null, "a");
	 */
		
		//System.out.println(	ssMap.put("1", "om").hashCode());
		
	for(Map.Entry oll: st.entrySet()) {
	
	//	System.out.println(" "+oll.getKey().hashCode()+" "+oll.getValue().hashCode());
		
		System.out.println(" "+oll.getKey().hashCode()+" "+oll.getValue().hashCode());
		
	}
		
	try {
		Thread.sleep(110);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
	st.put("1", "a");
	
	
	  for(Map.Entry oll: st.entrySet()) {
	  
	  System.out.print(" "+oll.getKey().hashCode()+" "+oll.getValue().hashCode());
	  }
	 
		//System.out.println(ssMap.put("1", "om").hashCode());
		
		
		//System.out.println(ssMap);
	}
	
	
	

}
