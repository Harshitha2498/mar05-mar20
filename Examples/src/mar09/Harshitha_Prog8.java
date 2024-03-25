package mar09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
    String name(){
        return "flower names";
    }
}
class Jasmine extends Flower {  
    String name() {
        return "Jasmine";
    }
}
class Lily extends Flower {
    String name() {
        return "Lily";
    }
}
class Region {
    Flower nationalFlower() {
        return new Flower();
    }
}
class WestBengal extends Region {
    Jasmine nationalFlower() {
        return new Jasmine();
    }
}
class AndhraPradesh extends Region {
    Lily nationalFlower() {
        return new Lily();
    }
}
public class Harshitha_Prog8 {
  public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Region region = null;
      try {
	      switch(br.readLine()){
	        	case "WestBengal":region = new WestBengal();
	        					  break;
	        	case "AndhraPradesh":region = new AndhraPradesh();
	        						 break;
	      }
	      Flower flower = region.nationalFlower();
	      System.out.println(flower.name());
	} catch (IOException e) {
		e.printStackTrace();
	}
      
    }
}