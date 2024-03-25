package mar09;
class Parent{
	void fun() {
		System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
	}
}
public class Harshitha_Prog2 extends Parent{
	void fun() {
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
		super.fun();
	}
	public static void main(String[] args) {
		Harshitha_Prog2 b=new Harshitha_Prog2();
		b.fun();
		//super.fun();
	}	
}
