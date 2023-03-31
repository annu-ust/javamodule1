package CreationalPattern.FactoryMethod;

public class UseVechicleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Vehicle seltos=Vehiclefactory.newInstance("Seltos");
  seltos.honk();
  Vehicle suzuki=Vehiclefactory.newInstance("XCross");
  suzuki.move();
	}

}
