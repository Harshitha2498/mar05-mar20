package mar11;

import java.io.IOException;

class Parent{
	void print() throws IOException{
		
		System.out.println("exception occurs");
	}
}
class Base extends Parent {
	
}
public class Harshitha_Propagation extends Base{
	public static void main(String[] args) {
		Parent object=new Base();
		try {
			object.print();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
