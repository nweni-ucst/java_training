package com.scm.javatraining;

/**
 * <h2>Student Class</h2>
 * <p>
 * Process for Displaying Student
 * </p>
 * 
 * @author NweNi
 *
 */
public class Student extends Person {

	private int studentid = 111;

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method of Student
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Student stu1 = new Student();
		System.out.println("ID : " + stu1.studentid);
		System.out.println("Name : " + stu1.fname + " " + stu1.lname);
		System.out.println("Age : " + stu1.age);
		System.out.println("Email : " + stu1.email);
		System.out.println("Blood type : " + stu1.blood);
		System.out.println("Acdemic Year : " + stu1.acdemicyear);
		// test for private varible cannot access
		// System.out.println(stu1.personId);
		stu1.learn();
//		It cannot call work() method because it is private
//		stu1.work();
	}
}
