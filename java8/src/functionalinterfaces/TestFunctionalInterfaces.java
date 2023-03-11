package functionalinterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> strings=Arrays.asList("ThamilNadu","Kerala","Karnataka","Andhra");	//another way of creating list
		
		
		
		
		
 Function <String,Integer> f=(str)->{
	                           return str.length();
	                           };
	        for(String str:strings) {
	        	System.out.println(f.apply(str));//reading from list 
	        }
	                          // System.out.println(f.apply("bbbbbbbbb"));
	
 Function <Integer,Integer> f2=(n)->{return n*n;};
 System.out.println(f2.apply(25));
 
 Function <String,String> f3=(str)->{return str.toUpperCase();
                                    };
                 System.out.println(f3.apply("ust"));
	}

}
