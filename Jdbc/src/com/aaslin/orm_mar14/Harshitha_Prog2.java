/*2) WAP to insert list of employees (only employees) in to database using stringBuilder to create insert query.*/
package com.aaslin.orm_mar14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Harshitha_Prog2 {
	static List<Employee1> emp() {
		Connection con = null;
		List<Employee1> employee = func();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			System.out.println("JDBC connection success");
			Statement st=con.createStatement();
			StringBuilder query = new StringBuilder();
			query.append("insert into employee(id,name) values ");
			for(int i=0;i<employee.size();i++) {
				Employee1 e=employee.get(i);
			 query.append("(").append(e.getId()).append(",").append("\"").append(e.getName()).append("\"").append(")");
			 if(i!=employee.size()-1) {
				 query.append(", ");
			 }
			}
	
			st.execute(query.toString());
			
			
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
		return employee;
	}

	private static List<Employee1> func() {
		// TODO Auto-generated method stub
		 List<Employee1> obj=new ArrayList<Employee1>();
		 obj.add(new Employee1(5,"kaii"));
		 obj.add(new Employee1(6,"hashi"));
		 obj.add(new Employee1(7,"varsma"));
		return obj;
	}

	public static void main(String[] args) {
		List<Employee1> resultSet = emp();
	}
}
