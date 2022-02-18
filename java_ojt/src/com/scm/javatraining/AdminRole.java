package com.scm.javatraining;

public class AdminRole extends Admin {
	
	protected void modify() {
		System.out.println("I have access to modify, Moderator!");
	}
	protected String moderator() {
		return text;
	}

	public static void main(String[] args) {
		Admin admin1=new Admin();
		admin1.modify();
		System.out.println(admin1.moderator());	
	}

}
