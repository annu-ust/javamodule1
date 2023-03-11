package listDemo;
import java.util.*;
public class TestArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> queue=new ArrayDeque();
 queue.addFirst("first");
 queue.add("second");
 queue.add("third");
queue.add("fourth");
queue.addLast("fifth");

System.out.println(queue);
System.out.println(queue.size());

String element=queue.getFirst();
System.out.println(element);

queue.pollFirst();
System.out.println(queue);//remove 1st element

String elements=queue.peek();//get 1st element
System.out.println(elements);
System.out.println(queue);


queue.poll();//remove 1st element
System.out.println(queue);


Iterator<String> itr=queue.iterator();//print in ascending order
while(itr.hasNext()) {
	System.out.println(itr.next());
}
Iterator<String> itr1=queue.descendingIterator();//print in descending order
while(itr1.hasNext()) {
	System.out.println(itr1.next());
}

	}

}
