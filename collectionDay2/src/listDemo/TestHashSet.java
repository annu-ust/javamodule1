package listDemo;
import java.util.*;
public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> bookSet=new HashSet<String>();
    bookSet.add("java in nut shell");
    bookSet.add("java complete referance");
    bookSet.add("thinking in java");
    bookSet.add("java in 21 days");
    bookSet.add("java for dummys");
    
    System.out.println(bookSet);
    System.out.println(bookSet.size());
    System.out.println(bookSet.contains("java in nut shell"));
    bookSet.add("thinking in java");
    System.out.println(bookSet.size());//5.will not allow duplicate elements,treat as one element so will not increment size
    
    for(String book:bookSet) {
    	System.out.println(book);
    }
    
    Iterator<String> iter=bookSet.iterator();
    while(iter.hasNext()) {
    	System.out.println(iter.next());
    }
    
    
	}

}
