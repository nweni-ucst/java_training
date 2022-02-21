package tutorial;

public class tutorial2 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method for tutorial2 to display off numbers between 1 to 10 and their
	 * sum
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("This will display odd numbers between 1 to 10:\nOdd numbers: ");
		// for loop to display odd numbers bwtween 1 to 10 and their sum.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\nTheir sum is : " + sum);
	}

}
