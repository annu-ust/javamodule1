package collections;
import java.util.*;

public class IterateArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> samp=new ArrayList<String>();
   ArrayList<Integer>samp1=new ArrayList<Integer>();
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the input");
   String s=sc.next();
   samp.add(s );
   samp.add("world");
   samp.add("you");
   samp.add("hai");
   
   Iterator<String>itr=samp.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   samp1.add(1);
	   samp1.add(2);
	   samp1.add(3);
	    for(int i:samp1) {
	    	System.out.println(i);
	    }
	    //array creation
	    String arr[]=new String[samp.size()];
	    for(int i=0;i<samp.size();i++) {
	    	arr[i]=samp.get(i);
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    //finding element
	    
	   }
   

}
