package functionalinterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.*;
public class BiConsumertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<String,String> map=new HashMap();
  map.put("ola", "o");
  map.put("hello", "H");
  map.put("chao", "C");
  
  
  map.forEach((k,v)->{System.out.println(k+" for "+v);});
  
  BiConsumer<String,String>bi=(k,v)->{System.out.println(k+"  for "+v);};
	map.forEach(bi);	  
		  
	}

}
