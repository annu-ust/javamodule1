package patterns;

public class NumberChangingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=7;
		 int k=1;//printing number
	       for(int i=1;i<=n;i++) {//row
	    	   for(int j=1;j<=i;j++) {//column
	    		   System.out.print( k +" ");
	    		   k++;
	    	   }
	    	   System.out.println(" ");
	       }
	}

}
