package com.csi.core3;

public class StringArrayChallenge {
	
	// we have given a aray ["omkarr", "1", "swapnil", "2", "abhi", "3"], saperate the each
	//integer value and alphabetical values .. you can use any method, 
	// no fixed format of output is required...

	public static void main(String[] args) {

		String alpha[] = { "omkarr", "10", "swapnil", "2", "abhi", "3" };

		String store[] = { "1", "2", "3", "4", "5", "10" };

		for (int j = 0; j < store.length; j++) {
			for (int k = 0; k < alpha.length; k++) {

				if (alpha[k].equals(store[j])) {
					
					int i= Integer.parseInt(store[j]);

					System.out.print(i + ",");
				}

			}

		}
		
		System.out.println("\n");

		for (int k = 0; k < alpha.length; k++) {

			if (alpha[k].length() > 1) {

				System.out.print(alpha[k] + ",");

			}

		}

	}

}
