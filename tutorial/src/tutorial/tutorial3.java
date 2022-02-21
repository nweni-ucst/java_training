package tutorial;

public class tutorial3 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method for tutorial3 to display the pattern like right angle triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int i = 1;
		// while loop for the pattern to display number 1 to 10 like right angle
		// triangle
		while (i <= 10) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			i++;
		}
	}

}
