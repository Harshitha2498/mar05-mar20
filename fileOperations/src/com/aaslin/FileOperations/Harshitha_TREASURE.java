package com.aaslin.FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Harshitha_TREASURE {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int coordinates;
			int shortest;
			List<Integer> sorting = null;
			while (true) {
				System.out.println("enter x and y coordinates");
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				sorting = new ArrayList<Integer>();
				String str;
				int i = 1;
				BufferedReader bufferedReader = new BufferedReader(
						new FileReader("D:\\Newfolder\\fileoperation\\mapfile.txt"));
				while ((str = bufferedReader.readLine()) != null) {
					String points[] = str.split(" ");
					int x1 = Integer.parseInt(points[0]);
					int y1 = Integer.parseInt(points[1]);
					coordinates = (int) distance(x1, y1, x, y);
					System.out.println("Treasure " + i + " : " + coordinates);
					i++;
					sorting.add(coordinates);
				}
				shortest = Collections.min(sorting);
				System.out.println("the shortest distance is: " + shortest);
				System.out
						.println("If you want to exit enter YES ,continue searching for more treasures then enter NO ");
				String exitornot = scanner.next();
				if (exitornot.equalsIgnoreCase("YES")) {
					break;
				}
				sorting.clear();
				bufferedReader.close();
			}
			scanner.close();
		} catch (IOException | ArrayIndexOutOfBoundsException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

	public static double distance(int x1, int y1, int x, int y) {
		return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
	}
}
