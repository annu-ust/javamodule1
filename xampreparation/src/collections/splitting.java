package collections;
import java.util.*;
public class splitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount:");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.println("enter the count of people:");
		int count=sc.nextInt();
		int sum1=0;
		int amt;
		for(int i=0;i<count;i++) {
			System.out.println("enter the amount by  person"+i+": ");
			amt=sc.nextInt();
			sum1=sum1+amt;
		}
  System.out.println("sum is:"+ sum1);
  int diff=amount-sum1;
  if(diff>amount) {
	  System.out.println("error");
	  
  }
  else if(diff<amount) {
	 int  upamount=diff;
	  int split=upamount/count;
	  System.out.println(split);
  }
  else if(diff==0){
	  System.out.println("correct");
  }
  
  
  
	}

}
