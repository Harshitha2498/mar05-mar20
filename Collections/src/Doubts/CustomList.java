package Doubts;

import java.util.ArrayList;

/**
 * @author Harshitha.D 
 * This is a custom list to append modi on every element
 * 
 */
class CustomList {
	public static void main(String[] args) {
		ArrayList<String> customlist = new ArrayList<String>() {
			@Override
			public boolean add(String val) {
				return super.add(val + "Modi");
			}
		};
		customlist.add("xyz");
		System.out.println(customlist);
	}
}
