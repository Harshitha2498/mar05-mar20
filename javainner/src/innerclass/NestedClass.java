package innerclass;

public class NestedClass {
	private static int x=30;
	static class Inner{
		void message() {
			System.out.println("inner static class"+x);
		}
		static void msg() {
			System.out.println("inner static class");
		}
	}
	public static void main(String[] args) {
		NestedClass.Inner inner=new NestedClass.Inner();
		inner.message();
		NestedClass.Inner.msg();
	}
}
