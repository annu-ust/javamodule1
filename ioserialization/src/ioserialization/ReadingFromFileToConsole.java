package ioserialization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingFromFileToConsole {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
		BufferedReader  buffer = new BufferedReader(reader);
        String data=buffer.readLine();
        while(data!=null) {
        	System.out.println(data);
        	data=buffer.readLine();
        }
        reader.close();
        buffer.close();
	}

}
