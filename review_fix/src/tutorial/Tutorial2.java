package tutorial;
/**
 * <h2> Tutorial2 Class</h2>
 * <p>
 * Process for Displaying Tutorial2
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial2 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to display off numbers between 1 to 10 and their sum
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("This will display odd numbers between 1 to 10:\nOdd numbers: ");
		//looping to display odd numbers between 1 to 10 and their sum.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\nTheir sum is : " + sum);
	}
}
