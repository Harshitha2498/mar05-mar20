package innerclass;
//interface Outer1{
class Outer1{//we can add any modifiers
	interface Inner{//private interface Inner{
		void msg();
	}
}
public class NestedInterface implements Outer1.Inner{
	public void msg() {
		System.out.println("nested interface");
	}
	public static void main(String[] args) {
		Outer1.Inner inner=new NestedInterface();
		inner.msg();
	}
}
