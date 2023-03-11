package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class SuppilerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("TamilNadu","Kerala","Karnataka","Andhra Pradesh;.");	//another way of creating list
		 Supplier<String>supplier=()->{
			                   return new String("holaa....");
			                   };
			            System.out.println(supplier.get());
	}
public static void fetchString(List<String>strings,Supplier<String>s) {
	
}
}
