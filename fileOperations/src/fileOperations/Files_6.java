package fileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Files_6 {
	public static void main(String[] args) {
		try (BufferedWriter br=new BufferedWriter(new FileWriter("D:\\Newfolder\\fileoperation\\hello.txt",true))){
			br.write("gajfhf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
