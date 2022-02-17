package testpackage;

import com.scm.javatraining.Person;

/**
 * <h2>TestPackage Class</h2>
 * <p>
 * This Class is to test Package by importing com.scm.javatraining Package
 * </p>
 * 
 * @author NweNi
 *
 */
public class TestPackage {
	/**
	 * <h2>main</h2>
	 * <p>
	 * main method of TestPackage
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("Name : " + person.fname + " " + person.lname);
		// calling public method of the object
		person.learn();
		// setting method to the instance object
		person.setAge(7);
		person.setEmail("chuechue3@pre.com");
		// get value from the instance object
		System.out.println("Age : " + person.getAge());
		System.out.println("Email : " + person.getEmail());
	}
}
