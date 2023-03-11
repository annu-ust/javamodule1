package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
public class PredicateTest {
//predicate balways depends upon condition,it will give true or false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("ThamilNadu","Kerala","Karnataka","Andhra Pradesh;.");	//another way of creating list
		 Predicate<String> p=(String str)->{
			 return str.length()>10;
		 };
		 for(String str:strings) {
			 System.out.println(p.test(str));
		 }
		 desiredlength(strings,p);
	}
public static void desiredlength(List<String>strings,Predicate<String>p) {
	for(String str:strings) {
		System.out.println(p.test(str));
	}
}
}
