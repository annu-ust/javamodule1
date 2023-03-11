package listDemo;
import java.util.*;
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<String> list=new LinkedList();
 list.add("Marker");
 list.add("pencile");
 list.add("pen");
 list.add("book");
 list.add("eraser");
 list.add("sharpner");
 System.out.println(list);
 System.out.println(list.size());
 System.out.println(list.get(4));
 System.out.println(list.getFirst());
 System.out.println(list.getLast());
 list.add(2, "note");
 System.out.println(list);
 System.out.println(list.size());
 Iterator<String> itr=list.descendingIterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
 }
 Iterator<String> itr1=list.listIterator();
 while(itr1.hasNext()) {
	String element=itr1.next();
	if(element.equals("book"));{
	      itr1.remove();}
	
 }
 System.out.println(itr1.next());
	}

}
