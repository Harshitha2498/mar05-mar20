
import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}
public class Harshitha_Prog4 {
	void count(ArrayList<Object> lst) {
		int x=0,y=0,z=0;
		for(int i=0;i<lst.size();i++) {
			System.out.println(i+"....."+lst.get(i));
			Object o=lst.get(i);
			System.out.println(o);
			if(o instanceof Student) {
				x++;
			}
			if(o instanceof Rockstar) {
				y++;
			}
			if(o instanceof Hacker) {
				z++;
			}
		}
		System.out.println(x+" "+y+" "+z);
	}
	public static void main(String[] args) {
		ArrayList<Object> lst=new ArrayList<>();
		Harshitha_Prog4 obj=new Harshitha_Prog4();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++) { 
			String str = sc.next();//Student
			try {
				lst.add(Class.forName(str));//Student
				System.out.println(str);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		obj.count(lst);
		sc.close();
	}
}
