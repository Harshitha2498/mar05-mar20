/*Write a Java program to establish a connection to a MySQL database using JDBC. Include code to handle any potential exceptions.*/
package com.aaslin.jdbc;

import java.sql.*;

public class Harshitha_JDBC_Prog1 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgnt", "root", "root");
			System.out.println("JDBC connection success");
		} catch (ClassNotFoundException cnfe) {
			System.err.println("JDBC driver not found");
		} catch (SQLException se) {
			System.err.println("JDBC connection failed. Message : " + se.getMessage());
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("JDBC connection closed");
				}
			} catch (SQLException e) {
				System.err.println("JDBC connection close failed. Message : " + e.getMessage());
			}

		}
	}
}
