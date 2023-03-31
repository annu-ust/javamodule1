package CreationalPattern.Singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con1=Connection.getConnection();//only first time the object is created
		Connection con2=Connection.getConnection();//here it is ref the first object
		if(con1.equals(con2)) {//checking whether it is singleton or not
			System.out.println("singleton");
		}
		else {
			System.out.println("not equal");
		}
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("singleton");
		}
		else {
			System.out.println("not equal");
		}

	}

}
