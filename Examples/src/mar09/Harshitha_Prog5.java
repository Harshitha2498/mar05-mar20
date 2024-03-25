package mar09;
import java.util.*;
public class Harshitha_Prog5 {
	@SuppressWarnings("rawtypes")
	public static void main(String []args){
        ArrayList<Object> mylist = new ArrayList<Object>();
        Scanner sc=new Scanner(System.in);
        mylist.add(sc.nextInt());
        mylist.add(sc.nextInt());
        mylist.add("###");
        mylist.add(sc.next());
        mylist.add(sc.next());
        Iterator it = func(mylist);
        
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
        sc.close();
    }

	 @SuppressWarnings("rawtypes")
	static Iterator func(ArrayList mylist) {
		// TODO Auto-generated method stub
		 Iterator it = mylist.iterator();
	        while(it.hasNext()){
	        	Object element = it.next();	
	        	if(element instanceof String)
	        		break;
	        }
		return it;
	}
}

