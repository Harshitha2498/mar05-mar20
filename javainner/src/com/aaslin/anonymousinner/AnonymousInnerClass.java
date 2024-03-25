package com.aaslin.anonymousinner;
interface Inner{
	void msg();
}
public class AnonymousInnerClass {
	public static void main(String[] args) {
		//we create a instance to interface by using Anonymous inner class by using ;
		//we can call it outside the main to
		
		Inner inner=new Inner() {
			public void msg() {
				System.out.println("hello");
			}
		};
		inner.msg();
	}
}
