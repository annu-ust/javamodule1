package userDefinedObjects;
import java.util.*;

//import oopsday4.statictest.Employee;
public class TestEmpHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<Employee> empset=new HashSet<Employee>();
      Employee emp1=new Employee("John Doe","Male",24,101,"Research",15000);
      //System.out.println(emp1);
      Employee emp2=new Employee("Jane Doe","Female",23,102,"Accounting",25000);
     // System.out.println(emp2);
      Employee emp3=new Employee("Johny Doe","Male",26,103,"Sales",30000);
     // System.out.println(emp3);
      Employee emp4=new Employee("Johan Doe","Male",24,104,"Research",10000);
     // System.out.println(emp4);
      Employee emp5=new Employee("John Doe","Male",24,101,"Research",15000);
     // System.out.println(emp5);
      empset.add(emp1);
      empset.add(emp2);
      empset.add(emp3);
      empset.add(emp4);
      empset.add(emp5);
      
      System.out.println(empset);
      System.out.println(empset.size());
	}

}
