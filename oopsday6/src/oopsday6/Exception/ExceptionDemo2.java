package oopsday6.Exception;
import java.util.*;
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program begin");
		try {
		int b=Integer.parseInt(args[0]);
		int a=Integer.parseInt(args[1]);
		int c=b/a;  
		String name=args[2];
		int data[]= {a,b};
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("program completed");

	}

}
