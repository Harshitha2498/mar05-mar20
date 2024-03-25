/*Write a Java program that retrieves all records from a given table in a database and prints them to the console. 
 * Use JDBC to accomplish this task, and ensure proper resource management (e.g., closing connections, statements, and result sets).
 */
package com.aaslin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Harshitha_JDBC_Prog4 {
	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgnt", "root", "root");
			System.out.println("JDBC connection success");
			st = con.createStatement();
			rs = st.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
						+ rs.getString(4) + "  " + rs.getInt(5) + "  " + rs.getInt(6));
		} catch (ClassNotFoundException cnfe) {
			System.err.println("JDBC driver not found");
		} catch (SQLException se) {
			System.err.println("JDBC connection failed. Message : " + se.getMessage());
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					System.out.println("JDBC Result set closed");
				}
				if (st != null) {
					st.close();
					System.out.println("JDBC Statement closed");
				}
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
