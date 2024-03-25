package objects;

import java.lang.reflect.Constructor;


public class Object3Ex {
	public static void main(String[] args) throws Exception {
		Constructor<Object5Ex>con= Object5Ex.class.getDeclaredConstructor();
		Object5Ex obj1=con.newInstance();
		Constructor<Object5Ex> con2= Object5Ex.class.getDeclaredConstructor(String.class,int.class);
		Object5Ex obj2=con2.newInstance("harshi",25);
		Object5Ex o2=(Object5Ex)obj2.clone();
		System.out.println("name :"+o2.name+"  age:  "+o2.age);
		
		Constructor<Object5Ex>con3= Object5Ex.class.getDeclaredConstructor(String.class,float.class);
		Object5Ex obj3=con3.newInstance("harshi",25000);
		Object5Ex o3=(Object5Ex)obj2.clone();
		System.out.println("name  :"+o3.name+" Salary : "+o3.salary);
		
		Constructor<Object5Ex>con4= Object5Ex.class.getDeclaredConstructor(String.class,float.class,int.class,String.class,String.class);
		Object5Ex obj4=con4.newInstance("harshi",26000,22,"kasi","IT");
		Object5Ex o4=(Object5Ex)obj2.clone();
		System.out.println("name  :"+o4.name+"\nSalary : "+o4.salary+"\nAge : "+o4.age+"\nmanager  : "+o4.manager+"\nDepartment : "+o4.department);
	}
}
