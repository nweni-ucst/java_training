package tutorial;

/**
 * <h2>Tutorial7 Class</h2>
 * <p>
 * Process for Displaying Tutorial7
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial7 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to generate a characters’ pattern.
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		int space;
		int minChar = 65;
		int maxChar = 70;
		// looping to generate the above characters' pattern
		for (int i = 1; i < 7; i++) {
			// looping for first part characters' pattern
			for (int j = minChar; j <= maxChar; j++) {
				System.out.print((char) (j));
			}
			// looping for space, middle pattern
			space = 2 * i - 1;
			for (int s = 1; s < space; s++) {
				System.out.print(" ");
			}
			// looping for third part characters' pattern
			for (int k = maxChar; k >= minChar; k--) {
				if (k == 'F') {
					continue;
				}
				System.out.print((char) k);
			}
			maxChar--;
			System.out.println();
		}
		// looping to generate below character's pattern
		for (int m = 5; m > 0; m--) {
			// looping for first part characters' pattern
			for (int p = 0; p <= 6 - m; p++) {
				System.out.print((char) (minChar + p));
			}
			// looping for space, middle pattern
			space = 2 * m - 1;
			for (int s = space; s > 1; s--) {
				System.out.print(" ");
			}
			// looping for third part characters' pattern
			for (int q = 6 - m; q >= 0; q--) {
				if ((minChar + q) == 'F') {
					continue;
				}
				System.out.print((char) (minChar + q));
			}
			System.out.println();
		}
	}
}
