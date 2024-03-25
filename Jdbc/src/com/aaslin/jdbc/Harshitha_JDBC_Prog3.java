/*Implement a Java class that encapsulates database operations for a specific table (e.g., "Employee"). 
 * Include methods for inserting a new record, updating an existing record, deleting a record, and retrieving records based on certain criteria. 
 * Make sure to handle exceptions appropriately.
*/
package com.aaslin.jdbc;

import java.sql.*;

public class Harshitha_JDBC_Prog3 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgnt", "root", "root");
			System.out.println("JDBC connection success");
			Statement st = con.createStatement();
			int a = st.executeUpdate("insert into employee values(18,'hakjdk','hwgh','74824',4758,5)");
			if (a > 0)
				System.out.println("record inserted");
			else
				System.out.println("record failed to insert");
			int b = st.executeUpdate("update employee set salary=57887 where emp_id=6");
			if (b > 0)
				System.out.println("record updated");
			else
				System.out.println("record failed to update");
			int c = st.executeUpdate("delete from employee where emp_id=7");
			if (c > 0)
				System.out.println("record deleted");
			else
				System.out.println("record failed to delete");
			ResultSet rs = st.executeQuery("select * from employee");
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
