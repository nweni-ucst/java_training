package com.scm.javatraining;

public class TestOperators {

	public static void main(String[] args) {

		// testing for Arithmetic operators
		int num1 = 12;
		int num2 = 4;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2 + "\n");

		// testing for logical operators && and bitwise &
		int num3 = 20;
		System.out.println(num1 < num2 && num1++ < num3);
		System.out.println("num1 :" + num1);
		// 12 because logical&& is not checked second condition
		System.out.println(num1 < num2 & num1++ < num3);
		System.out.println("num1 :" + num1 + "\n");
		// 13 because bitwise & checked second condition

		// testing for logical operator || bitwise |
		System.out.println(num1 > num2 || num1++ < num3);
		System.out.println("num1 :" + num1);
		System.out.println(num1 > num2 | num1++ < num3);
		System.out.println("num1 :" + num1 + "\n");

		// testing for Unary Operators
		System.out.println(num3++);
		System.out.println(num3--);
		System.out.println(++num3);
		System.out.println(--num3);

		// testing for Ternary Operator
		int min = (num2 < num3) ? num2 : num3;
		System.out.println("minimal value: " + min);
		int max = (num2 > num3) ? num2 : num3;
		System.out.println("maximal value: " + max + "\n");

		// testing for assignment operators
		num3 += 1;
		System.out.println(num3);
		num3 -= 2;
		System.out.println(num3);
		num3 *= 3;
		System.out.println(num3);
		num3 ^= 2;
		System.out.println(num3);
		num3 /= 4;
		System.out.println(num3);
		num3 %= 4;
		System.out.println(num3 + "\n");

		// testing for left Shift Operator
		System.out.println(10 << 2);
		System.out.println(10 << 3);
		System.out.println(8 << 4);

		// testing for right shift operator
		System.out.println(12 >> 2);
		System.out.println(10 >> 3);
		System.out.println(8 >> 4);

		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);

	}

}
