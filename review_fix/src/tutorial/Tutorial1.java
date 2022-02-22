package tutorial;
/**
 * <h2> Tutorial1 Class</h2>
 * <p>
 * Process for Displaying Tutorial1
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial1 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to display 1 to 100 number
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		System.out.println("This is tutorial-1 for displaying 1 to 100 numbers:\n");
		// looping to display 1 to 100 numbers
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
