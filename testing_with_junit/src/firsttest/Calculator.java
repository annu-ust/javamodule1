package firsttest;
import java.math.*;
public class Calculator {
 public int power(int b, int e) {
	// return Math.pow(b, e);
	 int p=1;
	 int i=1;
	 if(b==0||e==0) {
		 return 1;
	 }
	 else {
		 while(i<=e) {
			 p*=b;
		 }
	 }
	 return p;
 }
 public int fact(int n) {
	 int f=1;
	 for(int i=1;i<=n;i++) {
		 f=f*i;
	 }
	 return f;
 }
 public  boolean odd_even(int n) {
	 if(n%2==0)
	 { return true;}
	 else
	    {return false;}
}



		
	
}
