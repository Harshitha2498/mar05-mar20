package com.aaslin.mar13_Collections;

import java.util.ArrayList;
import java.util.List;
//Lists
public class Harshitha_CRUD_Prog1 {
	public static void main(String[] args) {
		List<Integer> list_id=new ArrayList<Integer>();
		List<String> list_name=new ArrayList<String>();
		list_id.add(1);
		list_id.add(2);
		list_id.add(3);
		list_id.add(4);
		list_id.add(5);
		list_id.add(6);
		System.out.println(list_id);
		list_name.add("harshi");
		list_name.add("ashi");
		list_name.add("ishi");
		list_name.add("varma");
		list_name.add("prachi");
		list_name.add("ayyan");
		System.out.println(list_name);
		list_id.set(3, 9);
		System.out.println(list_id);
		list_name.set(1, "kushi");
		System.out.println("After updation: "+list_name);
		list_name.remove(5);
		System.out.println("After deletion: "+list_name);
		System.out.println("read the value : "+list_name.get(4));
	}
}
