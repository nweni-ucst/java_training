package tutorial;

public class tutorial5 {

	/**
	 * <h2>main</h2>
	 * <p>
	 * main metod for tutorial5 to generate a *'s triangle
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int count1 = 0;
		int count2 = 6;
		for (int i = 0; i < 6; i++) {
			count1 = 0;
			count2 = 6 - i;
			// while loop to display numbers of space
			while (count1 <= i) {
				System.out.print(" ");
				count1++;
			}
			// while loop to display numbers of *
			while (count2 > 0) {
				System.out.print("*");
				count2--;
			}
			System.out.println();
		}
	}

}
