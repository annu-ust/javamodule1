package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Shape s=new Rectangle(15.5,20.1);
   double result=s.area();
   System.out.println("area of rectangle  "+result);
    s=new Square(15.5);
   double result1=s.area();
   System.out.println("area of Square  "+result1);
   s=new Circle(15);
   double result2=s.area();
   System.out.println("area of circle  "+result2);
	}

}
