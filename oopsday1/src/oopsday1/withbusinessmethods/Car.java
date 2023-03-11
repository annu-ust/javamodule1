package oopsday1.withbusinessmethods;

public class Car {
  
  private String color;
  private double price;
  private String Brand;
   private String model;
   
  
public Car(String color, double price, String brand, String model) {
		super();
		this.color = color;
		this.price = price;
		Brand = brand;
		this.model = model;
	}
 public void start() {
	 System.out.println("car is starting");
 }
 public void changeGear(int gear) {
	 System.out.println("car is in "+gear);
 }
 public void stop() {
	 System.out.println("car is stopping........!");
 }
@Override
public String toString() {
	return "Car [color=" + color + ", price=" + price + ", Brand=" + Brand + ", model=" + model + "]";
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}     
	
	
}
