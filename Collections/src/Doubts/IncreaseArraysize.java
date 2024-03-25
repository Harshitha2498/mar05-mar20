package Doubts;

import java.util.Arrays;

public class IncreaseArraysize {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 3 };
		int newSize = 3;
		int newLength = array.length + newSize;
		array = Arrays.copyOf(array, newLength);
		System.out.println(newLength);
	}
}
