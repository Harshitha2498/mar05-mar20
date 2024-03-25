package mar09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
	void setTitle(String title) {
		super.title=title;
	}
}
public class Harshitha_Prog1 {
	public static  void main(String[] args) throws Exception {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		String str=br.readLine();
		MyBook a=new MyBook();
		a.setTitle(str);
		System.out.println("The title is: "+a.getTitle());
	}
}
