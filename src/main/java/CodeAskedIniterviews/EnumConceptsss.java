package CodeAskedIniterviews;

class EnumExample1 {
	// defining the enum inside the class

	public enum Season {
		WINTER, SPRING, SUMMER, FALL;

		Season() {
			System.out.println("bhjgsd");
		}

		void show() {
			System.err.println("jhjfhj");
		}

	}

	public class EnumConceptsss {

		public static void main(String[] args) {

		
			for ( Season s: Season.values())
				System.out.println(s);
			EnumExample1 enumExample1= new EnumExample1();
			
			
		}
	}

}
