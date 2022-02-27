package tutorial;

import java.util.Scanner;

/**
 * <h2>Tutorial9 Class</h2>
 * <p>
 * Process for Displaying Tutorial9
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial9A {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to test the input number whether positvie or negative
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		// to test the input number whether positvie or negative
		Scanner scanner = new Scanner(System.in);
		// looping to test numbers many time
		do {
			try {
				System.out.print("Enter a number:");
				int num = Integer.parseInt(scanner.next());
				if (num > 0) {
					System.out.println("Number is positive.\n");
				} else if(num==0){
					System.out.println("Zero is neither positive or negative.\n");
				}else {
					System.out.println("Number is negative.\n");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} while (scanner.hasNextLine());
		scanner.close();
	}
}
