package dayMar07;
abstract class Cooking{
	abstract void serve();
	abstract void drinks();
}
abstract class Food extends Cooking{
	void serve() {
		System.out.println("serving");
	}
	void drinks() {
		System.out.println("drinks");
	}
}
class Prog2 extends Food{
	public static void main(String[] args) {
		Prog2 obj=new Prog2();
		obj.serve();
	}
}
