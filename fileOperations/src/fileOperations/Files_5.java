package fileOperations;

import java.io.FileWriter;

public class Files_5 {
public static void main(String[] args) {
			try (FileWriter fw=new FileWriter("D:\\Newfolder\\fileoperation\\hello.txt",true)){
				fw.write("welcome");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
