package patterns;

public class EvenTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=7;
		 int k=0;//even number
	       for(int i=1;i<n;i++) {
	    	   
	    	   for(int j=1;j<=i;j++) {
	    		   System.out.print( k +" ");
	    		   k=k+2;
	    	   }
	    	   System.out.println(" ");
	       }
	}

}
