package CreationalPattern.FactoryMethod;

public class XCross implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("started........."+getClass());

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stoped........."+getClass());

	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("pom pom........."+getClass());
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("moving........."+getClass());

	}

}
