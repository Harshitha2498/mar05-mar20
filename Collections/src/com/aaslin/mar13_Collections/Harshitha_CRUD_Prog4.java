package com.aaslin.mar13_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//MAP...............HashMap
public class Harshitha_CRUD_Prog4 {
	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"harshi");
		hm.put(2,"varma");
		hm.put(3,"ashi");
		hm.put(4,"happy");
		//printing hashmap elements
		for (Entry<Integer, String> me : hm.entrySet()) { 
           System.out.println(me.getKey() + ":"+ me.getValue()); 
        }
		hm.put(4, "kushi");
		System.out.println("After adding a duplicate key : ");
		for (Entry<Integer, String> me : hm.entrySet()) { 
	           System.out.println(me.getKey() + ":"+ me.getValue()); 
	    }
		System.out.println("finding a value : "+hm.get(1));
		hm.remove(3);
		System.out.println("After removing one element: ");
		for (Entry<Integer, String> me : hm.entrySet()) { 
	           System.out.println(me.getKey() + ":"+ me.getValue()); 
	    }
		hm.replace(1, "swachi");
		System.out.println("After updating the first value: ");
		for (Entry<Integer, String> me : hm.entrySet()) { 
	           System.out.println(me.getKey() + ":"+ me.getValue()); 
	    }
	}
}
  