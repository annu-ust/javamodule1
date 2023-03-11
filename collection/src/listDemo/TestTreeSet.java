package listDemo;


import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> bookSet=new TreeSet<String>();
	    bookSet.add("java in nut shell");
	    bookSet.add("java complete referance");
	    bookSet.add("thinking in java");
	    bookSet.add("java in 21 days");
	    bookSet.add("java for dummys");
	   // bookSet.add(null);//we cannot add null value to treeset.
	    
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


