package testpackage;

/**
 * <h2>AnotherTestPackage Class</h2>
 * <p>
 * This Class is to test Package without doing import com.scm.javatraining
 * Package
 * </p>
 * 
 * @author NweNi
 *
 */
public class AnotherTestPackage {

	/**
	 * <h2>main</h2>
	 * <p>
	 * This is main method of AnotherTestPackage Class
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		com.scm.javatraining.Person newPerson = new com.scm.javatraining.Person();
		System.out.println("Name : " + newPerson.fname + " " + newPerson.lname);
		newPerson.learn();
	}

}
