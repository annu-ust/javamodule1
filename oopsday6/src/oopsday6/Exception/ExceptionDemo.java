package oopsday6.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program begins");
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the digits ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println("cannot divided by zero");
		}catch(InputMismatchException e) {
			System.out.println(" invalid input");
		}
		System.out.println("program ends");

	}

}
