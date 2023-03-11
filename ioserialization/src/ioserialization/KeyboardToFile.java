package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class KeyboardToFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   String data=null;
   InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader reader =new BufferedReader(isr);
FileWriter writer =new FileWriter("Namadefile.txt");
System.out.println("enter some text:");
data=reader.readLine();
//System.out.println("You have entered ......"+data);
while(!data.equalsIgnoreCase("quit")){
	//System.out.println("enter some text:");
	 System.out.println("You have entered ......"+data);
	//writer.write("quit");
	writer.write(data);
    data=reader.readLine();
   
}
writer.flush();
writer.close();
reader.close();
System.out.println("main exits");
	}

}
