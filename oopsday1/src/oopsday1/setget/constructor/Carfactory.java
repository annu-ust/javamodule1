package oopsday1.setget.constructor;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car jack=new Car("black",10000,"TATA","Harrier");
     Car tata=new Car();
     System.out.println(jack.hashCode());
     System.out.println(Integer.toHexString(jack.hashCode()));
     System.out.println( jack);
     System.out.println(tata);
     /*System.out.println(jack.getPrice());
     System.out.println(jack.getColor());
     System.out.println(jack.getModel());
    
/*	 
  jack.color="Black";
     jack.price=1200000;
	 jack.Brand="TATA";
	 jack.model="Harrier";
	 System.out.println("Colour is "+jack.color);
	 System.out.println("Price of car "+jack.price);
	 System.out.println("Brand "+jack.Brand);
 System.out.println("Model "+jack.model);*/
	
	 Car bmw=new Car("white",550000,"BMW","X5");
	 System.out.println(bmw.hashCode());
	 System.out.println(Integer.toHexString(bmw.hashCode()));
	 /*bmw.color="white";
	 bmw.price=55000000;
	 bmw.Brand="BMW";
	 bmw.model="X5";
	 System.out.println("Colour is "+bmw.color);
	 System.out.println("Price of car "+bmw.price);
	 System.out.println("Brand "+bmw.Brand);
	 System.out.println("Model "+bmw.model);
	 */
	 
	}

}
