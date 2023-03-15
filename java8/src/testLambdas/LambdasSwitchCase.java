package testLambdas;

public class LambdasSwitchCase
{
 static double calculate(String operator,double x,double y ) {
	 return switch(operator) {
	 case "+"->x+y;
	 case "-"->x-y;
	 case "*"->x*y;
	 case "/"->{
		 if(y==0)
		 
			 throw new IllegalArgumentException("can't divide ");
	 
		 yield x/y;}
		 
	 default ->throw new IllegalArgumentException("unknown expression");
	 };
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdasSwitchCase lsc=new LambdasSwitchCase();
		System.out.println(lsc.calculate("+", 2, 3));
		System.out.println(lsc.calculate("-", 5, 2));
		System.out.println(lsc.calculate("*", 3, 2));
		//System.out.println(lsc.calculate("/", 6, 3));
		System.out.println(lsc.calculate("/", 2, 3));
		System.out.println(lsc.calculate("/", 2, 0));
		System.out.println(lsc.calculate("%", 2, 3));
		

	}

}
