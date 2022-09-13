import java.security.AlgorithmConstraints;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

 class TreeMapImpl {

	enum e {a,b,c};
	public static final String s="a"; 
	 
	// Write a Tree Map program to iterate element using for each

}

public class TreeMapConcept {

	public static void main(String[] args) {
		Map<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(1, "Abhi");
		tm.put(2, "Kunal");
		tm.put(3, "Nihal");
		tm.put(2, "jsdfj");

		// System.out.println(tm);

		for (Map.Entry abc : tm.entrySet()) {
			System.out.println(abc.getKey() + " " + abc.getValue());

		}

		// tm.forEach(System.out::println);

	}

}
