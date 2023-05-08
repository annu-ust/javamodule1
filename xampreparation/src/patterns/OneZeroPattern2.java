package patterns;

public class OneZeroPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int a=1;
	       for(int i=1;i<=n;i++) {
	    	   
	    	   for(int j=1;j<=i;j++) {
	    		    {
	    		    	if(i%2==0&&a%2==0) {
	 	    			   System.out.print(1+" ");
	 	    			   a++;

	    		    	}
	    		    	else {
		 	    			   System.out.print(0+" ");
		 	    			  a++;

	    		    	}
	    		   }
	    	   }
	    	   System.out.println(" ");
	       }
	}

}
