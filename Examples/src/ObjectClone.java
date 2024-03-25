
public class ObjectClone implements Cloneable{   
	String str = "New Object Created";   
	public static void main(String[] args){    
		ObjectClone obj1 = new ObjectClone();   
		try{    
			ObjectClone obj2 = (ObjectClone) obj1.clone();   
			System.out.println(obj2.str);   
		}   
		catch (Exception e){   
			System.out.println(e);   
		}   
	}  
} 
//by using clone() method