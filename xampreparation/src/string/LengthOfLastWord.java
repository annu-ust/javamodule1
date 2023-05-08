package string;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc=new Scanner(System.in); System.out.println("enter the string:");
		  String str=sc.nextLine(); int len=str.length(); int count=0; String[]
		  words=str.split("\\s"); int length=words.length-1; String b=words[length];
		  System.out.println(b); for(int i=0;i<b.length();i++) { count++;
		  
		  }
		  
		  System.out.println(count);
		 
		
	
	
	}

}
