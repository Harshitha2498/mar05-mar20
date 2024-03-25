package innerclass;
//Has -A
public class Outer {  //outer$Inner class created
	public class Inner{
		//public static void main(String[] args)//no static methods or main in inner class in java1.8 and used in java 17
		void message() {
			System.out.println("Inner");
		}
	}
	public static void main(String[] args) {
		Outer outerclass=new Outer();  //create a object to outer
		Outer.Inner inner=outerclass.new Inner();//create a object to inner
		inner.message();
	}
}
