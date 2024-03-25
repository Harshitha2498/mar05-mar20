package objects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Employee{
	int age;
	float salary;
	String name,manager,department;
	Employee(){
		System.out.println("basic constructor");
	}
	Employee(String name,float salary,int age,String manager,String department){
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.manager=manager;
		this.department=department;
	}
}
public class Object2Ex {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Constructor<Employee>con= Employee.class.getDeclaredConstructor();
		Employee obj1=con.newInstance();
		
		
		Constructor<Employee>con3= Employee.class.getDeclaredConstructor(String.class,float.class);
		Employee obj3=con3.newInstance("harshi",25000);
		System.out.println("name  :"+obj3.name+" Salary : "+obj3.salary);
		
		Constructor<Employee>con4= Employee.class.getDeclaredConstructor(String.class,float.class,int.class,String.class,String.class);
		Employee obj4=con4.newInstance("harshi",26000,22,"kasi","IT");
		System.out.println("name  :"+obj4.name+"\nSalary : "+obj4.salary+"\nAge : "+obj4.age+"\nmanager  : "+obj4.manager+"\nDepartment : "+obj4.department);
	}

}
