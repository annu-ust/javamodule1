package source;

public class NonSubClass {
	public NonSubClass() {
		// TODO Auto-generated constructor stub
		Parent p=new Parent();
		System.out.println(p.b);//non-subclass we need create object to access instance from class.
		System.out.println(p.c);
		System.out.println(p.d);
		//System.out.println(p.a);private instance
	}

 


}
