
public class Strings {
	public static void main(String args[]){
		String s=new String("harshi");
		String a="harshi";
		String b="harshi";
		String s1=new String("harshi");
		if(s==a){
			System.out.println("executed successfully s==a");
		}
		if(s.equals(a)){
			System.out.println("executed successfully s.equals(a)");
		}
		if(s==s1) {
			System.out.println("executed successfully s==s1");
		}
//		if(s=a) {
//			System.out.println("executed successfully s=a");//Type mismatch: cannot convert from String to boolean
//		}
		if(a==b) {
			System.out.println("executed successfully a==b");
		}
//		if(a=b) {
//			System.out.println("executed successfully a==b");//Type mismatch: cannot convert from String to boolean
//		}
		System.out.println("not executed");
	}		
}
