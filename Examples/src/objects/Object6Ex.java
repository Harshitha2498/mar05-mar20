package objects;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Object6Ex {
	public static void main(String[] args) {
	try{       
		  FileInputStream file = new FileInputStream("f1.txt");
		  ObjectInputStream in = new ObjectInputStream(file);   
		  Object4Ex a=(Object4Ex)in.readObject();  
		  System.out.println("name  :"+a.name+"\nSalary : "+a.salary+"\nAge : "+a.age+"\nmanager  : "+a.manager+"\nDepartment : "+a.department);       
		  in.close(); 
		  file.close();
	}
	catch(Exception e){
		System.out.println(e);
	}   
	}
}
