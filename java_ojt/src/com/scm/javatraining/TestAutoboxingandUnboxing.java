package com.scm.javatraining;

public class TestAutoboxingandUnboxing {

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method to test Wrapper Class including Autoboxing and Unboxing
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args){
		// creating primitives data type
		byte b = 11;
		short s = 22;
		int i = 33;
		long l = 44;
		float f = 55.5F;
		double d = 66.6D;
		char c = 'a';
		boolean b2 = true;

		// Autoboxing: Converting primitives into objects
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;

		//Printing value of the wrapper objects
		System.out.println("---Printing object values---");
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Integer object: " + intobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Double object: " + doubleobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);

		// Unboxing: Converting Objects to Primitives value
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;

		// Printing primitives value
		System.out.println("\n--Printing primitive values---");
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);
	}

}
