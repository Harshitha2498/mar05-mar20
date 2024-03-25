import java.awt.Window;

public class GarbageC{
	public static void main(String[] args) {
	for(int i=0;i<100;i++) {
		new Window(null);
	}
	System.out.println(Window.getWindows().length);
	System.gc();
	System.out.println(Window.getWindows().length);	
	}
}
