package dayMar07;
abstract class Car{
	void speed() {
		System.out.println("Car Speed");
	}
	void gear() {
		System.out.println("Car gear");
	}
	void applybreak() {
		System.out.println("apply break in car");
	}
}
abstract class Bus{
	void speed() {
		System.out.println("Bus Speed");
	}
	void gear() {
		System.out.println("Bus gear");
	}
	void applybreak() {
		System.out.println("apply break in Bus");
	}
}

public class Prog3 extends Car{	
	public static void main(String[] args) {
		Prog3 p=new Prog3();
		p.speed();
		p.gear();
		p.applybreak();
	}
}
