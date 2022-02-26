package com.scm.javatraining;

/**
 * <h2> AdminRole Class</h2>
 * <p>
 * Process for Displaying AdminRole extends from Admin Class
 * </p>
 * 
 * @author NweNi
 *
 */
public class AdminRole extends Admin {
	
	/**
	 * <h2> modify </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 */
	public void modify() {
		System.out.println("I have access to modify, Moderator!");
	}
	/**
	 * <h2> moderator </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	public String text="I am moderator in AdminRole Class.";
	protected String moderator() {
		return text;
	}

	/**
	 * <h2> main</h2>
	 * <p>
	 * main method of AdminRole class
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Admin admin1=new Admin();
		admin1.modify();
		System.out.println(admin1.moderator());	
	}

}
