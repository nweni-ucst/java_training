package com.scm.javatraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestMySql {
	/**
	 * <h2>main</h2>
	 * <p>
	 * main method for TestMySql
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String args[]){
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "0011");
			// here user is database name, root is username and password
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		//String insertStr="insert into student value (?,?,?)";
		//PreparableStatement prestat= con.PreparableStatement(insertStr);
		
	}
}
