package tutorial;

import java.util.Scanner;
/**
 * <h2>Tutorial10A Class</h2>
 * <p>
 * Process for Displaying Tutorial10A
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial10A {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to calculate the average value of array elements
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		int n;
		int[] numArray;
		int sum = 0;
		float avg;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter the number of elements you want to store: ");
			n = Integer.parseInt(sc.next());
			numArray = new int[n];
			System.out.print("\nEnter the elements to add in the array:");
			// to add the elements to the array and calculate sum
			for (int i = 0; i < n; i++) {
				numArray[i] = sc.nextInt();
				sum += numArray[i];
			}
			// calculate average of the array
			avg = (float) sum / n;
			System.out.println("The sum :" + sum + "\nThe average of the array: " + avg + "\n");
		} while (sc.hasNextLine());
		sc.close();
	}
}
