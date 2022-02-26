package com.scm.javatraining;

public class TestCustomWrapperClass {
	/**
	 * <h2>main</h2>
	 * <p>
	 * main method to test CustomWrappe rClass
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		//creating object custom2
		CustomWrapper custom1 = new CustomWrapper(10);
		System.out.println(custom1);
		//calling setter method via custom1 obj with value 15
		custom1.setValue(15);
		//calling getter method via custom1 obj
		System.out.println(custom1.getValue());
		
		//creating object custom2
		CustomWrapper custom2 = new CustomWrapper();
		//calling setter method via custom2 obj with value 20
		custom2.setValue(20);
		//calling getter method via custom2 obj
		System.out.println(custom2.getValue());
		//calling setter method via custom2 obj with valu 35
		custom2.setValue(35);
		//calling setter method via custom2 obj
		System.out.println(custom2.getValue());
	}
}
