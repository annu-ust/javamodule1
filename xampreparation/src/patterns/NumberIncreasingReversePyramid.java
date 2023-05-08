package patterns;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n=7;
	       for(int i=n;i>=1;i--) {//row
	    	   
	    	   for(int j=1;j<=i;j++) {//column
	    		   System.out.print( j +" ");
	    	   }
	    	   System.out.println(" ");
	       }
	}

}
