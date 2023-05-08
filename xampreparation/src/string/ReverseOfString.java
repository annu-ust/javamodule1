package string;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("enter the string");
		  Scanner sc=new Scanner(System.in);
		  String str=sc.nextLine();
		  System.out.println(str);
		 
		String[]words=str.split("\\s");
		int len=words.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}

	}

}
