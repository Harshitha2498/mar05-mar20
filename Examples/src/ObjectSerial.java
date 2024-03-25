import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;


class Employee implements Serializable{
	int id;
	String name;
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class ObjectSerial {
	public static void main(String[] args) {
		try {
			Employee emp=new Employee(14,"harshi");
			FileOutputStream fs=new FileOutputStream("f.txt");
			ObjectOutputStream obj=new ObjectOutputStream(fs);
			obj.writeObject(emp);
			obj.flush();
			obj.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try{       
			  FileInputStream file = new FileInputStream("f.txt");
              ObjectInputStream in = new ObjectInputStream(file);   
			  Employee emp1=(Employee)in.readObject();  
			  System.out.println(emp1.id+" "+emp1.name);       
			  in.close(); 
			  file.close();
		}
		catch(Exception e){
			System.out.println(e);
		}    
	}
}
