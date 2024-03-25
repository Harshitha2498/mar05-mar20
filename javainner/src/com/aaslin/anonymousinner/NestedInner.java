package com.aaslin.anonymousinner;
interface Outer{
	interface Inner{
		void msg();
	}
}
public class NestedInner {
	static Outer.Inner inner=new Outer.Inner() {
		public void msg() {
			System.out.println("nested inner anonymous class");
		}
	};
	public static void main(String[] args) {
		inner.msg();
	}
}
