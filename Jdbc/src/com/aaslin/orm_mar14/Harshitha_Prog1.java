/*Create Java Classes Employee (int id, String name, Department dept), Department(int id, String name).
DB: Employee (id,name,departmentId), Department (id,name)

1) Write a method to retrieve and return Employee List  with Department (only 1 dept tagged for a user) from DB. 
in main method print data as string from Employee List using toString in Objects Ref:( https://www.baeldung.com/java-tostring)
*/
package com.aaslin.orm_mar14;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Harshitha_Prog1 {
	static List<Employee> fun() {
		List<Employee> obj = new ArrayList<Employee>();
		Connection con = null;
		Employee e;
		Department d;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			System.out.println("JDBC connection success");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(
					"select e.id,e.name,d.id,d.name from employee1 e inner join department1 d where e.deptId=d.id");
			while (rs.next()) {
				e = new Employee();
				d = new Department();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				d.setId(rs.getInt(3));
				d.setName(rs.getString(4));
				e.setDept(d);
				obj.add(e);
				e = null;
				d = null;
			}
		} catch (ClassNotFoundException cnfe) {
			System.err.println("JDBC driver not found");
		} catch (SQLException se) {
			System.err.println("JDBC connection failed. Message : " + se.getMessage());
		} catch (Exception ex) {
			System.err.println("Exception : " + ex.getMessage());
			ex.printStackTrace();
		}
		return obj;
	}

	public static void main(String[] args) {
		List<Employee> resultSet = fun();
		for (Employee e : resultSet) {
			System.out.println(e.toString());
		}
	}
}
