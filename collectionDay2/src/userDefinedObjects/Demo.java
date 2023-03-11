package userDefinedObjects;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Demo {
	
	 
	
	    public static void main(String[] args)
	    {
	 
	        
	        String str = "The documentation for the polymorphic algorithms contained in this class generally includes a brief description of the implementation. Such descriptions should be regarded as implementation notes, rather than parts of the specification. Implementors should feel free to substitute other algorithms, so long as the specification itself is adhered to. (For example, the algorithm used by sort does not have to be a mergesort, but it does have to be stable.)The \"destructive\" algorithms contained in this class, that is, the algorithms that modify the collection on which they operate, are specified to throw UnsupportedOperationException if the collection does not support the appropriate mutation primitive(s), such as the set method. These algorithms may, but are not required to, throw this exception if an invocation would have no effect on the collection. For example, invoking the sort method on an unmodifiable list that is already sorted may or may not throw UnsupportedOperationException.";
	        
	        Map<String, Integer> hashMap = new HashMap<>();
	        String[] words = str.split(" ");
	         System.out.println(words.length);
	        for (String word : words) {
	 
	            Integer integer = hashMap.get(word);
	 
	            if (integer == null)
	                
	                hashMap.put(word, 1);
	 
	            else {
	               
	                hashMap.put(word, integer + 1);
	            }
	        }
	        System.out.println(hashMap);
	    }
	}