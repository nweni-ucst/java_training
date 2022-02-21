package tutorial;

public class tutorial1 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method for tutorial-1 to display 1 to 100 number
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		System.out.println("This is tutorial-1 for displaying 1 to 100 numbers:\n");
		// for loop to display 1 to 100 numbers
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
