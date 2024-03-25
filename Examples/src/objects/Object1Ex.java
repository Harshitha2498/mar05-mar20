package objects;

public class Object1Ex {
	
	public static void main(String[] args) {
		try {
			
			Show a= (Show) Class.forName("objects.Show").newInstance();
			a.task();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
