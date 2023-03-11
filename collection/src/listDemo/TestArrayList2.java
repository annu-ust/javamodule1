package listDemo;
import java.util.*;
public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> colors=new ArrayList<String>();//type specification
       colors.add("red");
       colors.add("blue");
       colors.add("green");
       colors.add("black");
       colors.add("pink");
       colors.add("white");
       colors.add("yellow");
       colors.add(null);
       System.out.println(colors);
       System.out.println(colors.size());
       String str =colors.get(3);
       System.out.println(str);
	}

}
