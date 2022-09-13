package CodeAskedIniterviews;



class StringImpl {

	/* 15. Write a java program to find repeated character in String */

}

public class StringBasedCode {

	public static void main(String[] args) {

		String s = "AbhiaaaAA";

		
	//	System.out.println(s.length());

		
		
		for (int i = 0; i < s.length(); i++) {

			for (int j = i+1; j < s.length(); j++) {
				
				if (s.charAt(i)==s.charAt(j)) 
				{
					System.out.println(s.charAt(j));
				} 
				

			} // sub for-2
		} // for-1

	}

}

// step 1 make class final
final class customImmutable
{
	//step 2 make variable private
	
	private int cId;
	private String cNameString;
	
	// step 3 use para constructor

	public customImmutable(int cId, String cNameString) {
	
		this.cId = cId;
		this.cNameString = cNameString;
	}
	
	
	
	
	
}
