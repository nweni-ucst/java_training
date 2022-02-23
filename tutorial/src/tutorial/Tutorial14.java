package tutorial;

import java.util.Scanner;
/**
 * <h2>Tutorial14 Class</h2>
 * <p>
 * Process for Displaying Tutorial14
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial14 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to find out whether the given String is Palindrome or not
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		do {
			original = reverse = "";
			System.out.print("Enter a string to check Paliindrome or not:");
			// inserting user input string
			original = sc.next();
			int lindex = original.length();
			// looping to reverse the input string
			for (int i = lindex - 1; i >= 0; i--) {
				reverse += original.charAt(i);
			}
			// condition to test whether Palindrone or not
			if (original.equals(reverse)) {
				System.out.println("Your given String is Palindrone.");
			} else {
				System.out.println("Your given String is not Palindrone.");
			}
			System.out.println();
		} while (sc.hasNextLine());
		sc.close();
	}
}
