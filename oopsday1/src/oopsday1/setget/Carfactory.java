package oopsday1.setget;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car jack=new Car();
     jack.setBrand("TATA");
     jack.setColor("White");
     jack.setPrice(100000);
     jack.setModel("Harrier");
     System.out.println( jack.getBrand());
     System.out.println(jack.getColor());
     System.out.println(jack.getModel());
     System.out.println(jack.getPrice());
/*	 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * jack.color="Black";
     jack.price=1200000;
	 jack.Brand="TATA";
	 jack.model="Harrier";
	 System.out.println("Colour is "+jack.color);
	 System.out.println("Price of car "+jack.price);
	 System.out.println("Brand "+jack.Brand);
 System.out.println("Model "+jack.model);*/
	
	/* Car bmw=new Car();
	 bmw.color="white";
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
