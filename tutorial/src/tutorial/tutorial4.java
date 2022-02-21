package tutorial;

public class tutorial4 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method for tutorial4 to display the pattern like right angle triangle.
	 * 
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// while loop for the pattern to display like right angle triangle.
		int i = 1;
		while (i <= 10) {
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print(j);
				}
				if (j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			i++;
			System.out.println();
		}
	}

}
