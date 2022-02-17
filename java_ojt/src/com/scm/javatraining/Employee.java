package com.scm.javatraining;

/**
 * <h2>Employee Class</h2>
 * <p>
 * Process for Displaying Employee
 * </p>
 * 
 * @author NweNi
 *
 */
public class Employee {
	private int employeeId = 4;
	String fname, lname;
	int age;
	String email;
	String blood;

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println("ID : " + emp1.employeeId);
		System.out.println("Name : " + emp1.fname + " " + emp1.lname);
		System.out.println("Age : " + emp1.age);
		System.out.println("Email : " + emp1.email);
		System.out.println("Blood type : " + emp1.blood);
	}
}
