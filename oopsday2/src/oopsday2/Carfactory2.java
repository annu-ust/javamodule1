package oopsday2;

public class Carfactory2 {

	public static void main(String[] args) {
		//CarIface car=new CarIface();
		// TODO Auto-generated method stub
       // CarIface car;
        CarIface car=new Car(5000,500,0,false);	
        car.start();
        car.honk();
        car.move();
        car.stop();
	}

}
