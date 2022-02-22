package tutorial;
/**
 * <h2> Tutorial5 Class</h2>
 * <p>
 * Process for Displaying Tutorial5
 * </p>
 * 
 * @author NweNi
 *
 */
public class Tutorial5 {
	/**
	 * <h2>main</h2>
	 * <p>
	 *to generate a *'s triangle
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			//looping to display numbers of space
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			//looping to display numbers of *
			for(int k=6-i;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
