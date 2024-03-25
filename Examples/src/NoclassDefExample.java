
class Show{
	void show(){
		System.out.println("details");
	}
}
public class NoclassDefExample{
	public static void main(String[] args) {

		//java.lang.ClassNotFoundException: xyz
		try {
			Class.forName("xyz");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}
}
