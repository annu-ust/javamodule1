package oopsday3;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Triangle t1=new Triangle();
		Triangle t2=new Triangle();
		//compare primitives
		int a=10;
		int b=35;
		
		boolean result= a==b;
	  System.out.println(result);//false
	  
	  
		//comparing objects 
	  //1.comparing references 
		// 2. comparing members
		
		result= r1==r2;
		 System.out.println(result);//false
		 System.out.println(r1.hashCode());//1211888640
		 System.out.println(r2.hashCode());//564160838
		 result =t1==t2;
		 System.out.println(result);//false
		 
		// result=r1==t2;
		 //System.out.println(result);//incompatible operand 

		 Rectangle r3=r1;
		 result =r3==r1;
		 System.out.println(result);//true refer to same object 
		 System.out.println(r1.hashCode());//1211888640
		 System.out.println(r3.hashCode());//1211888640
		 
		 
		 result=r1.equals(r2);
		 System.out.println(result);//false
		 result=r1.equals(r3);
		 System.out.println(result);//true
		 
		 //comparing members
		 r1.setLength(35.5);
		 r1.setBreadth(75.45);
		 
		 r2.setLength(35.5);
		 r2.setBreadth(75.45);
		 
		 if(r1.getLength()==r2.getLength() && r1.getBreadth()==r2.getBreadth())
		    {
			 System.out.println("same length and breadth");
		    }
		 else
			 System.out.println("not same");
		 t1.setS1(35.5);
		 t1.setS2(45.15);
		 t1.setS3(65.5);
		 if(r1.getLength()==t1.getS1())
		    {
			 System.out.println("same length");
		    }
		 else
			 System.out.println("not same");
		 
	}

}
