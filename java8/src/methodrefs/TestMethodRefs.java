package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula{
	public void m1();
}
class Some{
	public static void m2(){
		System.out.println("from m2.......!");
	}
}
class other{
	public other() {
		// TODO Auto-generated constructor stub
		System.out.println("from other constructor.......!");
	}
}
public class TestMethodRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Formula f=Some::m2;//static method reference to interface
//method reference operator  or method reference in java8
//it has 3 use constructor,instances and static method.
f.m1();
 f=other::new;//Reference of constructor to interface
 
 List<String> list=Arrays.asList("one ","two","three");
 list.stream().forEach(System.out::println);//instance method reference
 List<Integer>intlist=Arrays.asList(1,7,12,34,6665,8976);
Optional<Integer> num= intlist.stream().reduce(Math::max);//static reference method
System.out.println(num.get());
	}

}
