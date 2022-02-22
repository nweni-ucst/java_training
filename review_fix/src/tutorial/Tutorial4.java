package tutorial;
/**
 * <h2> Tutorial4 Class</h2>
 * <p>
 * Process for Displaying Tutorial4
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial4 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to display the pattern like right angle triangle.
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		// looping for the pattern to display like right angle triangle
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print(j);
				}
				if (j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
