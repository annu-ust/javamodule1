package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("ThamilNadu","Kerala","Karnataka","Andhra");	//another way of creating list
		 Function <String,Integer> f=(str)->{
			                           return str.length();
			                           };
printLength(strings,f);
Function <String,String> f1=(str)->{return str.toUpperCase();
};
coversioncase(strings,f1);

Function <String,String> f2=(str)->{return str.toLowerCase();
};
coversioncase(strings,f2);

Function <String,String> f3=(str)->{StringBuilder sb= new StringBuilder(str);
	  
	 return sb.reverse().toString();
	};
	reverse(strings,f3);
	}
	
	
	public static void printLength(List<String>strings,Function<String,Integer>fRef)

{
	
	for(String str:strings)
	{
		System.out.println(fRef.apply(str));//reading from list 
    }
}
public static void coversioncase(List<String>strings,Function<String,String>fRef)

{
	
	for(String str:strings)
	{
		System.out.println(fRef.apply(str));//reading from list 
    }
}
public static void reverse(List<String>strings,Function<String,String>f3Ref)

{
	
	for(String str:strings)
	{
		System.out.println(f3Ref.apply(str));//reading from list 
    }
}}









