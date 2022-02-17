package com.scm.javatraining;

/**
 * <h2>Person Class</h2>
 * <p>
 * Process for Displaying Person class
 * </p>
 * 
 * @author NweNi
 *
 */
public class Person {
	// testing public modifier
	public String fname = "Shwe Yi";
	public String lname = "Chue Myat";
	// testing default modifier
	int age = 5;
	String email = "chuely@edu.mm";
	// testing protected modifier
	protected String blood = "AB";
	protected String acdemicyear = "grade 1";
	// testing private modifier
	private int personId = 7;
	/**
	 * <h2>learn</h2>
	 * <p>
	 * learn() method
	 * </p>
	 *
	 * @return void
	 */
	void learn() {
		System.out.println("I like learning new things.");
	}
	/**
	 * <h2>work</h2>
	 * <p>
	 * private work() method
	 * </p>
	 *
	 * @return void
	 */
	private void work() {
		System.out.println("I can work the whole day.");
	}
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println("Person id is " + person1.personId);
		person1.learn();
		person1.work();
	}
}
