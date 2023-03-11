package ioserialization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadingFromFileWriteToFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
		FileWriter writer=new FileWriter("Copy.txt");
		BufferedReader buffer=new BufferedReader(reader);
		String data=null;
		while((data=buffer.readLine())!=null) {
			writer.write(data);
		}
		writer.flush();
		writer.close();
		reader.close();
		buffer.close();

	}

}
