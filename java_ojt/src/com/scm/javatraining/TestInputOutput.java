package com.scm.javatraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestInputOutput {

	/**
	 * <h2>main</h2>
	 * <p>
	 * main method for TestInputOutput
	 * </p>
	 *
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @return void
	 */
	public static void main(String[] args) throws IOException, FileNotFoundException {
		boolean check = true;
		Scanner newscanner = new Scanner(System.in);
		// do while loop for user input using Scanner
		do {
			try {
				System.out.print("Enter your name : ");
				String name = newscanner.next();
				System.out.print("Enter your mail : ");
				String email = newscanner.next();
				System.out.print("Enter your phone number : ");
				long phone = newscanner.nextLong();

				System.out.println("\nCheck your information is right?\n");
				System.out.println("Your Name is " + name);
				System.out.println("Your Email is " + email);
				System.out.println("Your phone number is " + phone);

				System.out.print("Please confirm,\nIs your data true or false?: ");
				check = newscanner.nextBoolean();
				if (check) {
					System.out.println("\nThanks! Right information!.\n");
				} else {
					System.out.println("\nTry Again.\n");
				}
			} catch (Exception e){
				System.out.println("Your data is wrong.");
				check=false;
			}
		} while (!check);
		newscanner.close();
		// testing fileoutput using FileOutputStream

		FileOutputStream fout = new FileOutputStream("D:\\Java Outputs\\textout.txt");
		String s = "Welcome to java OJT Training.";
		byte b[] = s.getBytes();// converting stringinto byte array
		fout.write(b);
		fout.close();
		System.out.println("File output is success...\n");

		// testing fileoutput using FileInputStream
		FileInputStream fin = new FileInputStream("D:\\Java Outputs\\textinput.txt");
		System.out.println(fin.available());
		int num;
		do {
			num = fin.read();
			System.out.print((char) num);
		} while (num != -1);

		fin.close();
		System.out.println("\nFile read is success.");
	}
}
