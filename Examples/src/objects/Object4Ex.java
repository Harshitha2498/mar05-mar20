package objects;

import java.io.*;
public class Object4Ex implements Serializable {
	int age;
	float salary;
	String name,manager,department;
	Object4Ex(){
		System.out.println("basic constructor");
	}
	Object4Ex(String name,int age){
		this.name=name;
		this.age=age;
	}
	Object4Ex(String name,float salary){
		this.name=name;
		this.salary=salary;
	}
	Object4Ex(String name,float salary,int age,String manager,String department){
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.manager=manager;
		this.department=department;
	}
	public static void main(String[] args) throws Exception {
		
		Object4Ex obj1=new Object4Ex();
		Object4Ex obj2=new Object4Ex("harshi",26000,22,"kasi","IT");
		FileOutputStream fs=new FileOutputStream("f1.txt");
		ObjectOutputStream a=new ObjectOutputStream(fs);
		a.writeObject(obj2);
		a.flush();
		a.close();
		
	}

}
