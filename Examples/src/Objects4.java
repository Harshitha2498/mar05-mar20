
import java.io.*;

public class Objects4 {
	public static void main(String[] args) {
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
