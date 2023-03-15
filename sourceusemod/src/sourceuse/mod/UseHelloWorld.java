package sourceuse.mod;

import source.mod.HelloWorld;

public class UseHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var c='z';//type inference
		var a=12;//type inference
		var s="annu";//type inference
		var f=12.876;//type inference
		//var u;//cannot use var without initialization
		//u=89;
		System.out.println(c);
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(f);
     try {
    	 HelloWorld world=new HelloWorld();
    	 world.message();
     }
     catch(Exception e){
    	 e.printStackTrace();
     }
	}

}
