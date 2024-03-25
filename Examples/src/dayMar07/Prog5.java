package dayMar07;
//multiple inheritance is not possible in java 
/*it shows '{' expected
public class Prog5 extends A,B{
    ^
1 error*/

interface A{
	void show();
}
interface B{
	void print();
}
public class Prog5 implements A,B{
	
	public void show() {
		System.out.println("Multiple inheritance by using interface");
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Success");
	}
	public static void main(String[] args) {
		Prog5 p=new Prog5();
		p.show();
		p.print();
	}
	
}