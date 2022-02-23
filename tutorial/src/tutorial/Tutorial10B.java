package tutorial;

import java.util.Scanner;
/**
 * <h2>Tutorial10B Class</h2>
 * <p>
 * Process for Displaying Tutorial10B
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial10B {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to remove a specific element from an array
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		int n, removeNum, i, j, k;
		int[] numArray;
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter the number of elements you want to store: ");
			n = Integer.parseInt(sc.next());
			numArray = new int[n];
			System.out.print("Enter the elements to add in the array:");
			// to read elements from the user
			for (i = 0; i < n; i++) {
				numArray[i] = sc.nextInt();
			}
			// to read remove element form the user
			System.out.print("Enter the element you want to remove from the array:");
			removeNum = Integer.parseInt(sc.next());
			// to find the position of the remove element
			for (j = 0; j < n; j++) {
				if (removeNum == numArray[j]) {
					pos = j;
					break;
				}
			}
			// removing the element from the array
			for (k = pos; k < n - 1; k++) {
				numArray[k] = numArray[k + 1];
			}
			n = n - 1;
			// to generate the array after deleting the element
			System.out.print("On deleting new array we get is: ");
			for (i = 0; i < n; i++) {
				System.out.print(numArray[i] + " ");
			}
			System.out.println("\n");
		} while (sc.hasNextLine());
		sc.close();
	}
}
