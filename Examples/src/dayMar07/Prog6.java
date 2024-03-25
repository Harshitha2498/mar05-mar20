package dayMar07;
class C1{
	void show() {
		System.out.println("print c1");
	}
}
class C2 extends C1{
	void show(){
		System.out.println("Print c2");
	}
}
class C3 extends C2{
	void show(){
		System.out.println("Print c3");
	}
}
public class Prog6 extends C3 {
	public static void main(String[] args) {
		C1 a=new C3();
		a.show();
		C1 b=new C2();
		b.show();
		C1 c=new C1();
		c.show();
/*		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		Type mismatch: cannot convert from C1 to C3*/
	//	C3 d=new C1();
	//	d.show();
	}
}