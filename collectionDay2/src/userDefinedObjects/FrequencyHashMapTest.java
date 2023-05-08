package userDefinedObjects;
import java.util.*;
import java.util.Map.Entry;
public class FrequencyHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		//String str="welcome to java , nice to meet you, java java java";
 String str="The documentation for the polymorphic algorithms contained in this class generally includes a brief description of the implementation. Such descriptions should be regarded as implementation notes, rather than parts of the specification. Implementors should feel free to substitute other algorithms, so long as the specification itself is adhered to. (For example, the algorithm used by sort does not have to be a mergesort, but it does have to be stable.)The \"destructive\" algorithms contained in this class, that is, the algorithms that modify the collection on which they operate, are specified to throw UnsupportedOperationException if the collection does not support the appropriate mutation primitive(s), such as the set method. These algorithms may, but are not required to, throw this exception if an invocation would have no effect on the collection. For example, invoking the sort method on an unmodifiable list that is already sorted may or may not throw UnsupportedOperationException.";
  String words[]=str.split(" ");
  System.out.println(words.length);
  HashMap<String,Integer> data=new HashMap<>();
 for(int i=0;i<words.length;i++) {
	 Integer integer =  data.get(words[i]);
	 if(integer !=null) {
		 count=data.get(words[i]);//count is the vale ie.the integer count of words
		 
		 data.put(words[i],++count);
	 }
	 else
	 {
		 data.put(words[i], 1);
	 }
 }
 System.out.println(data);
	 

 
}
 }
	
  
	
	

	
