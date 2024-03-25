/*4) Write plain java program to set data into Employee list with Salary of last 3 years. Java Object Structure to follow below 
 * Employee(id,name,List<Salary>), Salary (year,salary)Print the above employee list using toString()*/
package com.aaslin.orm_mar14;

import java.util.ArrayList;
import java.util.List;
class Salary{
	int year;
	int salary;
	Salary(int year,int salary) {
		this.year=year;
		this.salary=salary;
	}
	public String toString() {
		return "salary year"+ this.year+ ", salary=" + this.salary ;
	}
}
class Employee2{
	int id;
	String name;
	List<Salary> salary;
	Employee2(int id,String name){
		this.id=id;
		this.name=name;
		this.salary=new ArrayList<>();
	}
	public void addSalary(Salary sal) {
		salary.add(sal);
	}

	public String toString() {
		return "[Employee id=" + this.id + ", name=" + this.name + ", " + salary.toString() + "]";
	}
	
	
}
public class Harshitha_Prog4 {
	public static void main(String[] args) {
		List<Employee2> employee=new ArrayList<Employee2>();
		Employee2 emp=new Employee2(1,"harshi");
		emp.addSalary(new Salary(2020,15000));
		emp.addSalary(new Salary(2023,15000));
		employee.add(emp);
		Employee2 emp1=new Employee2(2,"varmaa");
		emp1.addSalary(new Salary(2021,15000));
		emp1.addSalary(new Salary(2023,15000));
		employee.add(emp1);
		for(Employee2 e:employee) {
			System.out.println(e);
		}
		
	}
}
