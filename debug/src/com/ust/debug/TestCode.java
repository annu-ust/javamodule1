package com.ust.debug;

public class TestCode {
	int a;
	boolean b;
	int factorial(int n) {
		if(n<1) 
			return 1;
	return n*factorial(subtract(n));
	}
	int subtract(int n) {
		
			return n-1;
	
	}
	void m1(){
		  System.out.println("from m1....");
		}

		 void m2(){
		    b=false;
		    System.out.println("1"+a++);
		    System.out.println("2");
		    System.out.println("3");
		    this.m1();
		    this.b=true;
		    System.out.println("4"+this.a++);
		    //in type script this is mandatory to call a instance variable
		    //where as in java it is not mandatory to use this inside a method
		    // to know the variable is a instance of class.
		    System.out.println("5");
		    System.out.println("6"+this.a--);
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCode().factorial(5);

	}

}
