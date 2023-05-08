package classworks;

import java.util.Scanner;

public class Returnone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=7;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>1) {
			
			if(num%2==0) {
				num=num/2;
				 System.out.println(num);
			}
			else {
				num=(num*3)+1;
				 System.out.println(num);
			}
		}
     System.out.println(num);
	}

}
