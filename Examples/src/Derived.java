class Base{
	Base(){
		System.out.println("Base class");
	}
}
public class Derived extends Base{
	Derived(){
		System.out.println("Derived class");
	}
	public static void main(String args[]){
		Base b=new Derived();
		Base b1=new Base();
		//Derived d=new Base(); //Type mismatch: cannot convert from Base to Derived
	}
}

