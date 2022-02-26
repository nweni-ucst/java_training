package com.scm.javatraining;

public class Admin implements User {

	protected String text="I am Moderator in Admin Class.";
	@Override
	public void modify() {
		System.out.println("String : I have access to modify.");
	}
	protected String moderator() {
		return text;
	}
	/**
	 * <h2>edit</h2>
	 * <p>
	 * edit method
	 * </p>
	 * 
	 */
	public void edit() {
		System.out.println("I can edit all files.");
	}
	/**
	 * <h2>delete</h2>
	 * <p>
	 * delete method
	 * </p>
	 * 
	 */
	public void delete() {
		System.out.println("I can detele all of files.");
	}
	/**
	 * <h2>writeCode</h2>
	 * <p>
	 * writeCode method
	 * </p>
	 *
	 * @return void
	 */
	//method overloading
	public static void writeCode(String str) {
		System.out.println(str + " I can write code.");
	}
	/**
	 * <h2>main</h2>
	 * <p>
	 * main method for Admin Class
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		//creating new user name programmer
		Admin programmer = new Admin();
		programmer.access();
		programmer.edit();
		programmer.delete();
		writeCode("I am Programmer.");
		System.out.println();
		//creating new user name developer
		Admin developer = new Admin();
		developer.access();
		developer.edit();
		developer.delete();
		writeCode("I am developer.");
	}
}
