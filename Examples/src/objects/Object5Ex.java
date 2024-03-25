package objects;

public class Object5Ex  implements Cloneable {
	int age;
	float salary;
	String name,manager,department;
	public Object5Ex(){
		System.out.println("basic constructor");
	}
	public Object5Ex(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Object5Ex(String name,float salary){
		this.name=name;
		this.salary=salary;
	}
	public Object5Ex(String name,float salary,int age,String manager,String department){
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.manager=manager;
		this.department=department;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	
}