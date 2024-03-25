/*Create a Java method that takes a SQL query as input and executes it using JDBC. 

 * The method should return a ResultSet containing the results of the query. Ensure proper error handling.
 */
package com.aaslin.jdbc;

import java.sql.*;

public class Harshitha_JDBC_Prog2 {
	static ResultSet fun(String query) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgnt", "root", "root");
			System.out.println("JDBC connection success");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			return rs;
		} catch (ClassNotFoundException cnfe) {
			System.err.println("JDBC driver not found");
		} catch (SQLException se) {
			System.err.println("JDBC connection failed. Message : " + se.getMessage());
		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			e.printStackTrace();
		} 
		return null;
	}

	public static void main(String[] args) {
		ResultSet resultSet = fun("select * from employee");
		try {
			if (resultSet != null)
				while (resultSet.next())
					System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
