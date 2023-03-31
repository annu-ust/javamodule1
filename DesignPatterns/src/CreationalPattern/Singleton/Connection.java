package CreationalPattern.Singleton;

public class Connection {
	static Connection con;//declare a static object of class
	private Connection() {
		// TODO Auto-generated constructor stub//make the constructor private in order to get singleton design
	}
	public static Connection getConnection() {//creating a static class method
		if(con!=null) {
			return con;
		}
		else {
			con=new Connection();//object is created
			return con;
		}
	//return new Connection();//only 1 st time we create the object 2 nd time onwards we return the object.
	}

}
