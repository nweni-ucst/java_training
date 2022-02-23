package tutorial;

import java.util.ArrayList;
/**
 * <h2>Tutorial10C Class</h2>
 * <p>
 * Process for Displaying Tutorial10C
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial10C {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to convert an ArrayList to an array
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		// creating a ArrayList object
		ArrayList<String> arrList = new ArrayList<String>();
		// adding elements to the ArrrayList
		arrList.add("Python");
		arrList.add("JAVA");
		arrList.add("PHP");
		arrList.add("Perl");
		arrList.add("C#");
		System.out.print("Printing elements in the ArrayList: ");
		for (String i : arrList) {
			System.out.print(i + " ");
		}
		//creating a String array
		String[] strArr=new String[arrList.size()];
		//ArrayList to Array using toArray() method
		arrList.toArray();
		for(int i=0;i<strArr.length;i++) {
			strArr[i]=arrList.get(i);
		}
		System.out.println("\n\nPrinting elements in the Array: ");
		for (String str : strArr) {
			System.out.print(str + " ");
		}
	}
}
