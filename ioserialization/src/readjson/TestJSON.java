package readjson;
import java.io.*;
import java.util.Arrays;
import org.json.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
public class TestJSON {
	public static void main(String[] args) {
		
	
	JSONObject employeeDetails = new JSONObject();
    employeeDetails.put("firstName", "Anil");
    employeeDetails.put("lastName", "Boppuri");
    employeeDetails.put("website", "javaport.in");
     
    JSONObject employeeObject = new JSONObject(); 
    employeeObject.put("employee", employeeDetails);
     
    //Second Employee
    JSONObject employeeDetails2 = new JSONObject();
    employeeDetails2.put("firstName", "Brian");
    employeeDetails2.put("lastName", "Schultz");
    employeeDetails2.put("website", "example.com");
     
    JSONObject employeeObject2 = new JSONObject(); 
    employeeObject2.put("employee", employeeDetails2);
     
    //Add employees to list
    JSONArray employeeList = new JSONArray();
    employeeList.add(employeeObject);
    employeeList.add(employeeObject2);
    
    try(FileWriter file= new FileWriter("employees.json")){
    	//we can write any JSONArray or JSONO
   	 file.write(employeeList.toJSONString());
   	 file.flush();
    }
    catch(IOException e) {
   	 e.printStackTrace();
    }
	}
	
}
