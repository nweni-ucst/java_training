package tutorial;

import java.util.Scanner;
/**
 * <h2>Tutorial13 Class</h2>
 * <p>
 * Process for Displaying Tutorial13
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial13 {
	/**
	 * <h2>num1</h2>
	 * <p>
	 * num1 int static
	 * </p>
	 */
	static int num1 = 0;
	/**
	 * <h2>num2</h2>
	 * <p>
	 * num2 int static
	 * </p>
	 */
	static int num2 = 1;
	/**
	 * <h2>num3</h2>
	 * <p>
	 * num3 int static
	 * </p>
	 */
	static int num3 = 1;
	/**
	 * <h2>printFibonacci</h2>
	 * <p>
	 * to calculate Fibonacci Series using recursion
	 * </p>
	 *
	 * @param count int
	 * @return void
	 */
	public static void printFibonacci(int count) {
		if (count > 0) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3 + " ");
			printFibonacci(count - 1);
		}
	}
	/**
	 * <h2>main</h2>
	 * <p>
	 * to calculate Fibonacci Series up to n numbers
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter a number to calculate Fibonacci:");
			n = Integer.parseInt(sc.next());
			num1 = 0;
			num2 = 1;
			System.out.print("Series of Fibonacci up to " + n + " number:\n");
			// calling printFibonnacci() method to calculate series
			printFibonacci(n);
			System.out.println("\n");
		} while (sc.hasNextLine());
		sc.close();
	}
}
