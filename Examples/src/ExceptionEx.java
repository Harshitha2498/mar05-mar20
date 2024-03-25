import java.io.*;

public class ExceptionEx {
	public static void main(String[] args) {
//java.lang.ArithmeticException: / by zero
		try {
			int i=1,j=0;
			System.out.println(i/j);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
//java.lang.ClassNotFoundException: FindMissingClass
       try {
            Class.forName("FindMissingClass");
        }
        catch (ClassNotFoundException ex) {
        	System.out.println(ex);   
        }
//java.lang.NullPointerException
       try {
          String s=null;
          if(s.equals("harshi")) {
        	  System.out.println("harshi");
          }
          else {
        	  System.out.println("else block");
          }
       }
       catch (NullPointerException ex) {
       	System.out.println(ex);   
       }
       	
		finally {
			System.out.println("no value found");
		}
	}
}
