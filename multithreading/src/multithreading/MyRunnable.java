package multithreading;
import java.util.Scanner;
public class MyRunnable implements Runnable {//provide space for runnable class

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Enter your input: ");
			int a=new Scanner(System.in).nextInt();
			System.out.println("got the input proceeding");//blocked state
			System.out.println(Thread.currentThread().getName()+"="+i);
			try {
				Thread.sleep(3000);//sleep state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
