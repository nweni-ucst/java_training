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
	public void learn() {
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

	public String fname = "Shwe Yi";

	/**
	 * <h2>fname</h2>
	 * <p>
	 * getter method for fname
	 * </p>
	 * 
	 * @return String
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * <h2>fname</h2>
	 * <p>
	 * setter method for fname
	 * </p>
	 * 
	 * @param fname
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * <h2>lname</h2>
	 * <p>
	 * getter method for lname
	 * </p>
	 * 
	 * @return String
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * <h2>lname</h2>
	 * <p>
	 * setter method for lname
	 * </p>
	 * 
	 * @param lname
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * <h2>personId</h2>
	 * <p>
	 * getPersonId
	 * </p>
	 * 
	 * @return int
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * <h2>personId</h2>
	 * <p>
	 * setPersonId
	 * </p>
	 * 
	 * @param personId
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * <h2>getAge</h2>
	 * <p>
	 * getter method for Age
	 * </p>
	 *
	 * @return
	 * @return int
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <h2>setAge</h2>
	 * <p>
	 * setter method for Age
	 * </p>
	 *
	 * @param age
	 * @return void
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * <h2>getEmail</h2>
	 * <p>
	 * getter method for email
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <h2>setEmail</h2>
	 * <p>
	 * setter method for email
	 * </p>
	 *
	 * @param email
	 * @return void
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * <h2>getBlood</h2>
	 * <p>
	 * getter method for blood
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getBlood() {
		return blood;
	}

	/**
	 * <h2>setBlood</h2>
	 * <p>
	 * setter method for blood
	 * </p>
	 *
	 * @param blood
	 * @return void
	 */
	public void setBlood(String blood) {
		this.blood = blood;
	}

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method of Person Class
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println("Person id is " + person1.personId);
		person1.learn();
		person1.work();
	}

}
