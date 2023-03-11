package oopsday3.atm.menu;
import java.util.*;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountException;
public class BankMenu {
	BankofAmerica2 boa=new BankofAmerica2();

 public BankMenu() {
	// TODO Auto-generated constructor stub
	 
	 Account ac1=new Account(101,"John Doe","savings",7000);
	 Account ac2=new Account(102,"John Doe","savings",2000);
	 Account ac3=new Account(103,"John Doe","salery",5000);
	 Account ac4=new Account(104,"John Doe","savings",6000);
	 Account ac5=new Account(105,"John Doe","pension",8000);
	 boa.addAccount(ac1);
	 boa.addAccount(ac2);
	 boa.addAccount(ac3);
	 boa.addAccount(ac4);
	 boa.addAccount(ac5);
	 }
      
	 public void menu() throws NegativeAmountException 
	 {
		 int ch;
	      Scanner sc=new Scanner(System.in);
		 
		 System.out.println("1.create account");
		 System.out.println("2.Deposit");
		 System.out.println("3.Withdraw the amount");
		 System.out.println("4.Balance Enquiry");
		 System.out.println("5.exit");
	 do {
		 
		 System.out.println("Enter your choice");
		 ch=sc.nextInt();
	 switch(ch)
	  {
	    case 1:{ System.out.println("enter the account number");
                   int actno=sc.nextInt();
	    	        boa.displayaccount(actno);;
	              break;
	            }
	    case 2:{System.out.println("enter the account number");
	            int actno=sc.nextInt();
	            System.out.println("enter the amount");
	            int amount=sc.nextInt();
	    	   double deposite=boa.deposite(amount,actno);
	             System.out.println(" the total amount "+deposite);
	             break;
	    	    }
	    case 3:{System.out.println("enter the account number");
                 int actno=sc.nextInt();
                  System.out.println("enter the amount");
                  int amount=sc.nextInt();
	            double withdraw=0;
				try {
					withdraw = boa.withdraw(amount, actno);
				} catch (InsufficientFundsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.out.println(" the amount is "+withdraw);
	            break;
	           }
	    case 4:{System.out.println("enter the account number");
                int actno=sc.nextInt();
        
	    	   double balance=boa.balanceaEnquiry(actno);
	    	   System.out.println(balance);
	    	   break;
	           }
	    case 5:{System.exit(0);}
	    }
	    
     }while(ch!=5);
   }
}
