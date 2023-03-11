package methodrefs;

import java.util.Optional;

public class TestOptionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str=null;
    String str2="hello";
    //Optional<String> optional1=Optional.of(str);//nullpointerexception
    //System.out.println(optional1.get());//nullpointerexception
    Optional<String> optional2=Optional.ofNullable(str2);
    //System.out.println(optional2.get());
    if(optional2.isPresent()) {
    	System.out.println("value is  present  "+optional2.get());
    }
    else
    {
    	System.out.println("null");
    }
	}

}
