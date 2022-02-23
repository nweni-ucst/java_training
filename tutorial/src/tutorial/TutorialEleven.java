package tutorial;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h2>Tutorial11A Class</h2>
 * <p>
 * Process for Displaying Tutorial11A
 * </p>
 * 
 * @author NweNi
 *
 */
public class TutorialEleven {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to create a new array list, add some elements (string) and print out the
	 * collection.
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		// creating a ArrayList for Tutorial A
		ArrayList<String> arrList = new ArrayList<String>();
		// adding elements to the ArrrayList
		arrList.add("Red");
		arrList.add("Green");
		arrList.add("Orange");
		arrList.add("White");
		arrList.add("Black");
		System.out.println("Printing elements in the ArrayList: ");
		// printing using for loop
		for (int index = 0; index < arrList.size(); index++) {
			System.out.print(arrList.get(index));
			if (index != arrList.size() - 1) {
				System.out.print(", ");
			}
		}
		// creating a new ArrayList
		ArrayList<String> newArrList = new ArrayList<String>();
		// adding elements to the ArrrayList
		newArrList.add("Red");
		newArrList.add("Green");
		newArrList.add("Black");
		newArrList.add("White");
		newArrList.add("Pink");
		System.out.println("\n\nNew ArrayList before Swap: ");
		// printing using for loop
		for (int index = 0; index < newArrList.size(); index++) {
			System.out.print(newArrList.get(index));
			if (index != newArrList.size() - 1) {
				System.out.print(", ");
			}
		}
		// swapping elements using Collections.swap()method
		Collections.swap(newArrList, 0, 2);
		System.out.println("\n\nNew ArrayList after Swap: ");
		// printing using for each loop
		for (Object listObj : newArrList) {
			System.out.print(listObj + ", ");
		}
	}
}
