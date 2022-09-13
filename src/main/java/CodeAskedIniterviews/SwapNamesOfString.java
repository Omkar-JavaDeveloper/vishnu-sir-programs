package CodeAskedIniterviews;

public class SwapNamesOfString {

	public static void main(String[] args) {

		String nameString = " omkar prashant swapnil ";

		String[] strings = nameString.split(" ");

		System.out.println(strings[0] + " " + strings[2] + " " + strings[1]);

		String aaString = "llll";
		String newString = "kjkjkjk";

		String ss = nameString.replace("omkar", "gjgjg");

		System.out.println(nameString.substring(0, 5));

		System.out.println(nameString.trim());

		System.out.println(nameString.trim().concat("arrrrrrrrrrrr"));
		System.out.println(ss);

	}
}