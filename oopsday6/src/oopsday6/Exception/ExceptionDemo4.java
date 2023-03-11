package oopsday6.Exception;
import java.sql.*;
public class ExceptionDemo4 {
	 static void method() throws SQLException
	  {
		  throw new SQLException("connection failer");
	  }
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		method();
		/*try {
	method();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	*/}

}
