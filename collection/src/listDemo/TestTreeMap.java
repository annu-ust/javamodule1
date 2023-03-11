package listDemo;
import java.util.*;
import java.util.Map.Entry;
public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TreeMap<String, String> countryCurr=new TreeMap<>();	
   countryCurr.put("Uk","Pound");
	
	countryCurr.put("IND","Rupee");
	countryCurr.put("USA","Dollar");
	
	System.out.println(countryCurr);//print in ascending order
	System.out.println(countryCurr.get("IND"));
	countryCurr.put("IND", "Rupe");//replace old value wit new value
	System.out.println(countryCurr);
	System.out.println(countryCurr.size());
	
	System.out.println(countryCurr.containsKey("Uk"));//gives boolean value depending upon the presence of key
	System.out.println(countryCurr.containsValue("Pound"));//gives boolean value depending upon the presence of value
   //hash map  has 3 views
	//1.key view-
	Set<String> keys=countryCurr.keySet();
	for(String key:keys) {
		System.out.println(key);//gives the key set
	}
	//2.value view
	Collection<String> values=countryCurr.values();
	for(String val:values) {
		System.out.println(val);//gives the collection of values
	}
	//3.key value together
	Set<Entry<String,String>> entries=countryCurr.entrySet();
	for(Entry<String, String> entry:entries) {
		System.out.println(entry);
	}
	}}
