package oopsday6.Exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program begin");
		try {
			System.out.println(" enter try...");
			int c=10/0;
			System.out.println("from try after exception");
		}catch(Exception e) {
			System.out.println("from catch.....");
		}
		//catch (ArithmeticException e) {
			//e.printStackTrace();
		//}
		finally {
			System.out.println("from finally");
		}
        System.out.println("program completed");
	}

}
