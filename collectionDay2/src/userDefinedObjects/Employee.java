package userDefinedObjects;

import java.util.Objects;

public class Employee extends Person implements Comparable{
 private long empid;
 private String deptno;
 private double salary;
 public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String name, String gender, int age,long empid,String deptno,double salary) {
	super(name, gender, age);
	// TODO Auto-generated constructor stub
	this.empid=empid;
	this.deptno=deptno;
	this.salary=salary;
	
}
public long getEmpid() {
	return empid;
}
public void setEmpid(long empid) {
	this.empid = empid;
}
public String getDeptno() {
	return deptno;
}
public void setDeptno(String deptno) {
	this.deptno = deptno;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
			+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
}
 /*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	  Employee ref=null;
	  if(obj!=null)
		  ref=(Employee)obj;
		//return super.equals(obj);
	  if(ref.getEmpid()==this.empid && ref.getName().equals(this.getName())&& ref.deptno==this.deptno) {
		  return true;}
     else
    	return false;
	  
	}
 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
	 int code=this.hashCode()* 32 *((int)this.empid) * (this.getName().length())*this.deptno.length();
		return super.hashCode();
	}*/
@Override
public int hashCode() {
	return Objects.hash(deptno, empid, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(deptno, other.deptno) && empid == other.empid
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Employee ref=null;
	if(o!=null) {
		ref=(Employee)o;
	}
	if(this.empid<ref.getEmpid()) {
		return -1;//ascending order,if it is 1 then it will print as descending order.
	}
	else if(this.empid>ref.getEmpid()) {
		return 1;
	}
	else {
	return 0;}
}

 
}
