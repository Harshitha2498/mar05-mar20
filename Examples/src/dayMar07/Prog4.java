package dayMar07;

interface Restaurant1{
	final static int a=10;
	void biryani() ;
	void drinks() ;
	void dessert();
	default void area(int l,int b)
	{
		System.out.println(l*b);
	}
}
interface Restaurant2{
	void biryani() ;
	void drinks() ;
	void dessert();
}
public class Prog4 implements Restaurant1,Restaurant2{
	@Override
	public void biryani() {
		System.out.println("biryani ");
	}

	@Override
	public void drinks() {
		System.out.println("drinks ");
	}

	@Override
	public void dessert() {
		System.out.println("dessert ");
		
	}
	public static void main(String[] args){
		//Prog4 p=new Prog4();
		Restaurant1 r1=new Prog4();
		Restaurant2 r2=new Prog4();
		r1.biryani();
		r2.biryani();
		r2.drinks();
		r1.dessert();
	}

}	