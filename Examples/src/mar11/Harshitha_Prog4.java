package mar11;
import java.io.FileOutputStream;

public class Harshitha_Prog4 {
	public static void main(String[] args) {
		try(FileOutputStream fs=new FileOutputStream("resource.txt")){
			String txt="hello!";
			byte arr[]=txt.getBytes();
			fs.write(arr);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}