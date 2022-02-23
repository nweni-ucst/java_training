package tutorial;

import java.util.HashMap;
/**
 * <h2>Tutorial12A Class</h2>
 * <p>
 * Process for Displaying TutorialTwelve
 * </p>
 * 
 * @author NweNi
 *
 */
public class TutorialTwelve {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to associate the specified value with the specified key in a HashMap
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) throws NullPointerException {
		// for Tutorial 12(a)
		// Creating a HashMap
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "HTML"); // Put elements in Map
		hashmap.put(2, "CSS");
		hashmap.put(3, "JavaScript");
		hashmap.put(4, "JAVA");
		// printing all mapping in the hashmap
		System.out.println("Printing all mapping in the hashmap:");
		String val;
		for (int i = 1; i <= hashmap.size(); i++) {
			val = (String) hashmap.get(i);
			System.out.println("Hashmap of get(" + i + "): " + val);
		}
		//// for Tutorial 12(b)
		System.out.println("\nPrinting all copying mapping in new hashmap:");
		// creating a new HashMap
		HashMap<Integer, String> newmap = new HashMap<Integer, String>();
		// copy all of the mapping from existing hashmap
		newmap.putAll(hashmap);
		System.out.println("Values in newmap: " + newmap);
		// for Tutorial 12(c)
		// check if a map contains a mapping for the specified key
		System.out.println("\nCheck if key 2 exists: " + newmap.containsKey(2));
		// check existence of value 'html'
		System.out.println("Check if value 'html' exists: " + newmap.containsValue("html"));

	}
}
