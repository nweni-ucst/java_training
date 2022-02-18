package com.scm.javatraining;

public interface User{
	public static final String name = "User";
	String role="Admin";
	
	/**
	 * <h2> access</h2>
	 * <p>
	 * access method
	 * </p>
	 *
	 * @return void
	 */
	default void access() {
		System.out.println("I can access all of files.");
	}
	
	/**
	 * <h2> writeCode</h2>
	 * <p>
	 * writeCode method
	 * </p>
	 *
	 * @return void
	 */
	public static void writeCode() {
		System.out.println("I can write code");
	}
	void edit();
	void delete();
}
