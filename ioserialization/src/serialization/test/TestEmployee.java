package serialization.test;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestEmployee {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  Employee emp=new Employee(101,"John Doe",4000,"ninak enthina");
  FileOutputStream fos=new FileOutputStream("emp.dat");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(emp);
  
	}

}
