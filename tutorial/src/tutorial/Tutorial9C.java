package tutorial;

import java.util.Scanner;
/**
 * <h2>Tutorial9C Class</h2>
 * <p>
 * Process for Displaying Tutorial9C
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial9C {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to test input year is whether leap year or not
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean leap = false;
		do {
			try {
				System.out.print("Enter a number:");
				num = Integer.parseInt(sc.next());
				if (num % 4 == 0) {
					if (num % 100 == 0) {
						if (num % 400 == 0) {
							leap = true;
						} else {
							leap = false;
						}
					} else {
						leap = true;
					}
				} else {
					leap = false;
				}

				if (leap) {
					System.out.println("It is a leap year\n");
				} else {
					System.out.println("It is not a leap year\n");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} while (sc.hasNextLine());
		sc.close();
	}
}
