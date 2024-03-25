

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.*;
public class CloneObjects {
	int age;
	float salary;
	String name,manager,department;
	CloneObjects(){
		System.out.println("basic constructor");
	}
	CloneObjects(String name,int age){
		this.name=name;
		this.age=age;
	}
	CloneObjects(String name,float salary){
		this.name=name;
		this.salary=salary;
	}
	CloneObjects(String name,float salary,int age,String manager,String department){
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.manager=manager;
		this.department=department;
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException {
		Constructor<CloneObjects>con= CloneObjects.class.getDeclaredConstructor();
		CloneObjects obj1=con.newInstance();
		
		
		Constructor<CloneObjects>con2= CloneObjects.class.getDeclaredConstructor(String.class,int.class);
		CloneObjects obj2=con2.newInstance("harshi",25);
		CloneObjects o2=(CloneObjects)obj2.clone();
		System.out.println("name :"+o2.name+"  age:  "+o2.age);
		
		Constructor<CloneObjects>con3= CloneObjects.class.getDeclaredConstructor(String.class,float.class);
		CloneObjects obj3=con3.newInstance("harshi",25000);
		System.out.println("name  :"+obj3.name+" Salary : "+obj3.salary);
		
		Constructor<CloneObjects>con4= CloneObjects.class.getDeclaredConstructor(String.class,float.class,int.class,String.class,String.class);
		CloneObjects obj4=con4.newInstance("harshi",26000,22,"kasi","IT");
		System.out.println("name  :"+obj4.name+"\nSalary : "+obj4.salary+"\nAge : "+obj4.age+"\nmanager  : "+obj4.manager+"\nDepartment : "+obj4.department);
	}

}
