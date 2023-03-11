package oopsday2;

public class Car implements CarIface {
	private double fuel;
	private double battery;
	private double kilometerRun;
	private boolean engineStatus;
	
	public Car() {}
	
	public Car(double fuel,double battery,double kilometerRun,boolean engineStatus) {
		this.fuel=fuel;
		this.battery=battery;
		this.kilometerRun=kilometerRun;
		this.engineStatus=engineStatus;
	}
    
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	public double getKilometerRun() {
		return kilometerRun;
	}
	public void setKilometerRun(double kilometerRun) {
		this.kilometerRun = kilometerRun;
	}
	public boolean isEngineStatus() {
		return engineStatus;
	}
	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		if (engineStatus==false && fuel>1000 && battery >100) {
			System.out.println("engine moving.......!");
			engineStatus=true;
		}

	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
      System.out.println("papara papara paaa");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		if(engineStatus) {
			for(int i=0;i<50;i++) {
				System.out.println("Car is moving.....!");
				fuel=fuel-10;
				battery=battery-2;
				kilometerRun++;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
      System.out.println("car is stoping....!");
      this.engineStatus=false;
      //engineStatus=false;
      
	}
	
	
	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilometerRun=" + kilometerRun + ", engineStatus="
				+ engineStatus + "]";
	}
}
