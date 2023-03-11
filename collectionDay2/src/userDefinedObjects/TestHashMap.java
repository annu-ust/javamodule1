package userDefinedObjects;
import java.util.*;
public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Employee emp1=new Employee("John Doe","Male",24,101,"Research",15000);
	      Employee emp2=new Employee("Jane Doe","Female",23,102,"Accounting",25000);
	      Employee emp3=new Employee("Johny Doe","Male",26,103,"Sales",30000);
	      Employee emp4=new Employee("Johan Doe","Male",24,104,"Research",10000);
	      Employee emp5=new Employee("John Doe","Male",24,101,"Research",15000);
	    
	      
	      
	      HashSet<Employee> empset=new HashSet<Employee>();
	      empset.add(emp1);
	      empset.add(emp2);
	      empset.add(emp3);
	      empset.add(emp4);
	      empset.add(emp5);
	      
	      
	      TreeSet<Employee> empSet=new TreeSet<Employee>();
	      empSet.add(emp1);
	      empSet.add(emp2);
	      empSet.add(emp3);
	      empSet.add(emp4);
	      empSet.add(emp5);
	      
	      ArrayList<Employee> empList=new ArrayList<Employee>();
	      empList.add(emp1);
	      empList.add(emp2);
	      empList.add(emp3);
	      empList.add(emp4);
	      empList.add(emp5);
	      
	      HashMap<String,Collection> dataMap=new HashMap<>();
	      dataMap.put("empList", empList);
	      dataMap.put("empset", empset);
	      dataMap.put("empSet", empSet);
	      
	      
	      System.out.println(dataMap);
	      System.out.println(dataMap.size());
	      
	      Collection<Employee>list=dataMap.get("empList");
	      Iterator<Employee> itr=list.iterator();
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	      
	      Collection<Employee>set=dataMap.get("empset");
	       itr=set.iterator();
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	      
	      Collection<Employee>Set=dataMap.get("empSet");
	     itr=Set.iterator();
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	      
	      
	}

}
