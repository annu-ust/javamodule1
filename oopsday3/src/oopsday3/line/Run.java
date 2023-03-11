package oopsday3.line;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial x coordinate");
		int x1 = sc.nextInt();
		System.out.println("Enter the  y coordinate ");
		int y1=sc.nextInt();
		System.out.println("Enter the final x coordinate ");
		int x2=sc.nextInt();
    PointClass p1=new PointClass(x1,y1);
    PointClass p2=new PointClass(x2,y1);
    DrawLine d=new DrawLine();
    d.drawline(p1, p2);
	}

}
