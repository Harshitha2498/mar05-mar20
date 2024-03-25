/*3) Write plain Java classes Employee(id,name,String[] dept) and perform CRUD operations on dept
  Ex: Employee : 1, Varma, ["IT","HR"] to 1, Varma, ["IT"] to 1, Vamsi, ["IT"] to to 1, Vamsi, []*/
package com.aaslin.orm_mar14;

import java.util.ArrayList;
import java.util.List;

class Employees {
	int id;
	String name;
	List<String> dept;
	Employees(int id, String name, List<String> department) {
		this.id = id;
		this.name = name;
		this.dept = department;
	}

	public void changeName(String name) {
		this.name = name;
		System.out.println(id + ", " + name + ", " + dept);
	}
}

public class Harshitha_Prog3 {
	public static void main(String[] args) {
		List<String> dept = new ArrayList<>();
		dept.add("IT");
		dept.add("HR");
		dept.add("ADMIN");
		Employees employees = new Employees(1, "varma", dept);
		System.out.println(employees.id + ", " + employees.name + ", " + employees.dept);
		dept.remove(2);
		System.out.println(employees.id + ", " + employees.name + ", " + employees.dept);
		employees.changeName("vamsi");
		dept.clear();
		System.out.println(employees.id + ", " + employees.name + ", " + employees.dept);
	}
}