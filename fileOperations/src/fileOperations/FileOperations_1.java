package fileOperations;

import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations_1 {
	public static void main(String[] args) {
		try(InputStreamReader is =new InputStreamReader(System.in)) {
			int l=is.read();
			while(is.ready()) {
				System.out.println((char)l);
				l=is.read();
			}
		}		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
