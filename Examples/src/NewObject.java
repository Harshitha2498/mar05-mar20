
public class NewObject {
	NewObject(){
		System.out.println("basic program");
	}
	void show() {
		System.out.println("show method");
	}
	public static void main(String[] args) {
		NewObject o=new NewObject(); 
		//class.newInstance() 
		try {   
			NewObject obj = NewObject.class.newInstance();  
			obj.show();
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
}
