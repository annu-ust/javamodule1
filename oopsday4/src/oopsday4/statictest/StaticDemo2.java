package oopsday4.statictest;

public class StaticDemo2 {
	static int a;
   public static void method() {
	   System.out.println("from method"+a);
	   //method2();//we cannot access a non static method in static method
   }
   public void method2() {
	   System.out.println(a);//we can refer static variable in a instance method
	   method();//we can access static method in non static methods
   }
}
