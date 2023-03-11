package mathfunction;

public class Mathmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MathImp m=new MathImp();
     
     System.out.println("sum of numbers "+m.add(25, 19));
     System.out.println("Difference is "+m.sub(99, 15));
     System.out.println("Product of two numbers "+m.mul(55, 2));
     System.out.println("Division of two numbers "+m.div(15, 3));
     System.out.println("Remainder of two  number is "+m.rem(15, 2));
     m.prime(15);
     System.out.println("factorial is "+m.factorial(5));
     m.odd_or_even(31);
     m.positive_or_negative(-87);
     System.out.println("reverse of number is "+m.reverse(123));
     
	}

}
