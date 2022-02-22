package tutorial;
/**
 * <h2> Tutorial3 Class</h2>
 * <p>
 * Process for Displaying Tutorial3
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial3 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to display the pattern like right angle triangle
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		int i = 1;
		// looping for the pattern to display number 1 to 10 like right angle triangle
		while (i <= 10) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			i++;
		}
	}
}
