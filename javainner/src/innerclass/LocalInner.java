package innerclass;

public class LocalInner {
	void innerMethod(){
		class Inner{
			void message() {
				System.out.println("Local inner class");
			}
		} 
		//local instaitian 
		Inner inner=new Inner();
		inner.message();
	}
	public static void main(String[] args) {
		LocalInner outer=new LocalInner();
		outer.innerMethod();
	}
}
