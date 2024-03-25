package fileOperations;

import java.io.FileReader;
import java.io.IOException;

public class FileOperations_2 {
	public static void main(String[] args) {
		try (FileReader is = new FileReader("D:\\Newfolder\\fileoperation\\hello.txt")) {
			int letter = is.read();
			while (is.ready()) {
				System.out.println((char) letter);
				letter = is.read();
			}
			System.out.println((char) letter);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
