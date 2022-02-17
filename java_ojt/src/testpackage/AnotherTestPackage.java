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
		// creating object directly calling a class from another package
		com.scm.javatraining.Person newPerson = new com.scm.javatraining.Person();
		// Calling public method
		newPerson.learn();
		// setting value to the object
		newPerson.setFname("Nann Suel");
		newPerson.setLname("Pyae Nwe");
		newPerson.setAge(20);
		newPerson.setEmail("suelpyaenwe@edu.mm");
		newPerson.setBlood("O");
		// get value from the object
		System.out.println("Name : " + newPerson.fname + " " + newPerson.lname);
		System.out.println("Age : " + newPerson.getAge());
		System.out.println("Email : " + newPerson.getEmail());
		System.out.println("Blood Type :" + newPerson.getBlood());
	}

}
