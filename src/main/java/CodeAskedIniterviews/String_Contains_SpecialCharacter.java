package CodeAskedIniterviews;

import java.util.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//statement= Remove all Special characters from the given String (String s) 

//statement= to remove the only special charaters from string (String nn )which occurence is >1
public class String_Contains_SpecialCharacter {

	public static void main(String[] args) {
		System.out.println(removeSpecial());

		String_Contains_SpecialCharacter str = new String_Contains_SpecialCharacter();

		System.out.println(str.removeSpecialCharWhichOccuredmoreTimes());

	}

	static String removeSpecial() {
		//statement= Remove all Special characters from the given String (String s) 

		String s = "om@@@k$ar";

		String newString = "";

		for (int a = 0; a < s.length(); a++) {

			if (Character.isAlphabetic(s.charAt(a))) {
				newString = newString + s.charAt(a);

			}

		}
	
		return newString;

	}

	String removeSpecialCharWhichOccuredmoreTimes() {
		// statement= to remove the only special charaters from string (String nn )which occurence is >1
		String nn = "jnkaw@@@oooookn%%%%%^*###JHSJ";
		String mm = nn;
		Set<Character> ss = new HashSet<>();

		String specialChar = "";

		//required output=jnkawoookn^*JHSJ

		int count = 0;
		for (int a = 0; a < nn.length(); a++) {
			if (!Character.isAlphabetic(nn.charAt(a))) {
				specialChar = specialChar + nn.charAt(a);
			}
		}
		

		char[] cha = specialChar.toCharArray();
		for (int l = 0; l < specialChar.length(); l++) {
			for (int m = l + 1; m < specialChar.length(); m++) {
				if (cha[l] == cha[m]) {
					ss.add(cha[l]);
				}
			}
		}

		String finalOutput = "";
		for (int i = 0; i < nn.length(); i++) {
			if (!ss.contains(nn.charAt(i))) {
				finalOutput= finalOutput+nn.charAt(i);

			}
		}
		return finalOutput;
	}
}
