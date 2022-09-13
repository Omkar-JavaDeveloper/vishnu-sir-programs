package CodeAskedIniterviews;

public class ReverseStringButNotSpecialChar {
	
	public static void main(String[] args) {
		String string= "o%mk##a*r";
		//otpt= r%ak##m*o
		String rev= "";
		
		for(int i= string.length()-1; i>=0;i--) {
			if(Character.isAlphabetic(string.charAt(i))) {
			rev= rev+ string.charAt(i);
			}}
		
		//System.out.println(rev);//rakmo
		
		String required= "";
		
		int count=0;
		
		for(int i= 0; i<string.length();i++) {
			
			if(Character.isAlphabetic(string.charAt(i))) {
				required= required+ rev.charAt(count++);
			}
			else {
				required= required+ string.charAt(i);
				
			}
		}
		
		System.out.println(required);
//swapnil
	}

}
