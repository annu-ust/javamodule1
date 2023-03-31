package CreationalPattern.FactoryMethod;

public class Vehiclefactory {
	
 public static Vehicle newInstance(String car) {//we can give any method name
	 
	 Vehicle vehicle=null;
	 
	 if(car==null) {
		 return null;
	 }
	 else if(car.equals("Seltos")) {
		 vehicle=new Seltos();
		 
	 }
	 else if(car.equals("XCross")) {
		 vehicle=new XCross(); 
	 }
	 return vehicle;
 }
}
