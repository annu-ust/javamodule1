package testLambdas;
@FunctionalInterface
interface Shape{
	double area();
	//double perimeter(); -not allowed due to functional interface
}
interface math{
	double power(int a,int b);
}
interface fact{
	double facto(int a);
}
public class Example {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
 Runnable r1=new Runnable() {
	 public void run() {
		 System.out.println("from run method");
	 }
 };
	Thread t2=new Thread(r1);
	t2.start();
		Runnable r=()->{
	 for(int i=1;i<5;i++) {
		 System.out.println("in run method "+1);
	 }
 };
		Thread t=new Thread(r);
		t.start();
		
		
		//factorial 
		fact f=(int x)->{
			int flag=1;
			for(int i=1;i<=x;i++) {
				flag=flag*i;
			}
			return flag;
		};
		double f1=f.facto(5);
		System.out.println(f1);
		
		//power
		math m=(int b,int e)->{int p=1;
                for(int i=1;i<=e;i++) 
                {p*=b;}
                return p;};
               double p=m.power(2, 3);
               System.out.println(p);
		
	Shape s=()->{
	return 0.0;
};
double result=s.area();
System.out.println(result);
	}

}
