package dayMar08;

public class Prog3 {
	public static void main(String[] args) {
		int num,b,a;
		System.out.println("Armstrong numbers between 1 to 1000");
		for(int i=2;i<1000;i++){
			num=i;
			b=0;
			if(i>1&&i<=9)
				System.out.print(i+" ");
			while(num>0){
				a=num%10;
				b+=a*a*a;
				num/=10;	
			}
			if(i==b) {
				System.out.print(i+" ");
			}
		}
	}
}
