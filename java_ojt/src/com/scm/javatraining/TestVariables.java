package com.scm.javatraining;

public class TestVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declaring and creating variables
		String name = "Chue Chue";
		String txt = "hello java";
		System.out.println(txt.length());
		System.out.println(txt.indexOf("j"));
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase() + "\n");

		int age = 15;
		float weight = 95.89f;
		char stat = 'A';
		System.out.println("Name:" + name + "\nAge:" + age + "\nweight:" + weight + "lb\nstatus:" + stat);

		// testing for byte variable and overflow
		int num3 = 130;
		byte num4 = (byte) num3;
		System.out.println("num3 :" + num3);
		System.out.println("byte value :" + num4 + "\n");

		// testing for short variable
		int num5 = 32768;
		short num6 = (short) num5;
		System.out.println("num5 :" + num5);
		System.out.println("short value :" + num6 + "\n");

		// testing for float variable
		float f = 10.5f;
		int num7 = (int) f;
		System.out.println("float value:" + f);
		System.out.println("num7 :" + num7 + "\n");

		// testing for double and long variable
		double d1 = 222.34d;
		long num8 = (long) d1;
		System.out.println("double value: " + d1);
		System.out.println("long value :" + num8);
	}

}
