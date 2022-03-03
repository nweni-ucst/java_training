package tutorial;

/**
 * <h2>Tutorial8 Class</h2>
 * <p>
 * Process for Displaying Tutorial8
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial8 {
	/**
	 * <h2>main</h2>
	 * <p>
	 * to generate a characters' pattern
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		// to generate above character's pattern
		char ch = 'A';
		for (int i = 0; i < 5; i++) {
			for (int p = 0; p <= i; p++) {
				System.out.print((char) (ch + i + p) + " ");
				ch = (char) (ch + i);
			}
			ch = 'A';
			System.out.println();
		}
		// to generate below character's pattern
		ch = 'J';
		int num = 0;
		for (int j = 5; j > 1; j--) {
			for (int q = 1; q <= j - 1; q++) {
				System.out.print((char) (ch + q - j) + " ");
				ch = (char) (ch + j + num);
			}
			num += 2;
			ch = 'J';
			System.out.println();
		}
	}
}
