package dayMar07;

/*
 * @author Harshitha.D
 * Print area of a rectangle
 * */
class Overloading {
	public void area(int l, int b) {
		//Print area of rectangle
		System.out.println("Area of rectangle : " + l * b);
	}

	public float area(float l, float b) {
		return l * b;
	}
}

public class Prog1 extends Overloading {
	public static void main(String[] args) {
		Prog1 p = new Prog1();
		//
		p.area(5, 6);
		System.out.println("Area of rectangle in float : " + p.area(4.3f, 5f));
	}
}
