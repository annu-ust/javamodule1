package oopsday4.statictest;

public class CompanyHr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employee emp1=new Employee("John Doe","Male",24,101,"Research",15000);
  System.out.println(emp1);
  Employee emp2=new Employee("Jane Doe","Female",23,102,"Accounting",25000);
  System.out.println(emp2);
  Employee emp3=new Employee("Johny Doe","Male",26,103,"Sales",30000);
  System.out.println(emp3);
  Employee emp4=new Employee("Johan Doe","Male",24,104,"Research",10000);
  System.out.println(emp4);
  Employee emp5=new Employee("John Doe","Male",24,101,"Research",15000);
  System.out.println(emp5);
  if(emp1.equals(emp5)) {
	  System.out.println("the objects are equal");
  }
  else
	  System.out.println("not equal");
	}

}
