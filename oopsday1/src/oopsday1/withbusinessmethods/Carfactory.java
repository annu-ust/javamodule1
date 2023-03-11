package oopsday1.withbusinessmethods;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car jack=new Car("black",10000,"TATA","Harrier");
     jack.start();
     jack.changeGear(3);
     jack.stop();
     
	 Car bmw=new Car("white",550000,"BMW","X5");
	 bmw.start();
	 bmw.changeGear(2);
	 bmw.stop();
	}

}
