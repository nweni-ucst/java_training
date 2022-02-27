package tutorial;

/**
 * <h2>Tutorial6 Class</h2>
 * <p>
 * Process for Displaying Tutorial6
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial6 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to generate a number's pattern
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		// looping for to generate above number's pattern
		int i,j,num;
		for (i = 0; i < 7; i++) {
			for (int s1 = 0; s1 < i; s1++) {
				System.out.print(" ");
			}
			for (num = 1; num < 8 - i; num++) {
				System.out.print((num + i) + " ");
			}
			System.out.println();
		}
		// looping for to generate below number's pattern
		for (j = 6; j > 0; j--) {
			for (int s2 = 1; s2 < j; s2++) {
				System.out.print(" ");
			}
			for (num = 0; num < 8 - j; num++) {
				System.out.print((num + j) + " ");
			}
			System.out.println();
		}
	}
}
