
public class Propagation {
	@SuppressWarnings("null")
	void show() {
		String str=null;
		if (str.equals("harshi")) 
            System.out.print("equals");
	}
	void test() {
//		int i=20/0;  //java.lang.ArithmeticException: / by zero
		show();
		
	}
	void view() {
		test();
	}
	void plan() {
		try {
			view();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {

		Propagation p=new Propagation();
		p.plan();
		System.out.println("exceed");
	}
}
