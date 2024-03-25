package Doubts;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("aaslin");
		list.add("harshi");
		for(String s:list) {
			System.out.println(s);
		}
	}
}
class customList<E> extends ArrayList<E>{
	@Override
	public boolean add(E str) {
		return super.str+"Modi";
	}
}
