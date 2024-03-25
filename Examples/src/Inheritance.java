class InheritA{
	String name="harshi";
}
class InheritB extends InheritA{
	
}
public class Inheritance extends InheritB{
	public static void main(String[] args) {
		Inheritance i=new Inheritance();
		System.out.println("name: "+i.name);
	}
}
