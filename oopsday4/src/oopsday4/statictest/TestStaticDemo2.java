package oopsday4.statictest;

public class TestStaticDemo2 {
   public static void main(String[] args) {
	StaticDemo2 d1=new StaticDemo2();
	System.out.println(d1.a);
	d1.method();
	System.out.println();
	StaticDemo2.method();
}
}
