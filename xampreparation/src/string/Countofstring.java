package string;

import java.util.*;
public class Countofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the string only contain * and #:");
 String str=sc.nextLine();
 int count1=0;
 int count2=0;

 char ch[]=str.toCharArray();
 for(int i=0;i<ch.length;i++) {
	 
	 if(ch[i]=='*') {
		 count1 ++;
	 }
	 else {
		 count2++;
	 }
   }
 if(count1>count2) {
	 System.out.println("positive number");
 }
 else if(count1==count2) {
	 System.out.println("0");
 }
 else {
	 System.out.println("negative");
 }
}

}
