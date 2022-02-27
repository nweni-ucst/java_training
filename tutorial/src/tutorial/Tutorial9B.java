package tutorial;

import java.util.Scanner;

/**
 * <h2>Tutorial9B Class</h2>
 * <p>
 * Process for Displaying Tutorial9B
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial9B {
	/**
	 * <h2>main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three number :");
		// creating int array
		int[] numArray = new int[3];
		// looping to get user input to int array
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}
		// to calculate greatest number
		int max = numArray[0];
		for (int j = 1; j < numArray.length; j++) {
			if (max < numArray[j]) {
				max = numArray[j];
			}
		}
		System.out.println("The greatest: " + max);
		sc.close();
	}
}
