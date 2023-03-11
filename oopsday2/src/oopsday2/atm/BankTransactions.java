package oopsday2.atm;

public class BankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BankingIface bom=new BankofAmerica();
     double balance=bom.deposite(250);
     System.out.println("balance after deposite "+balance);
     balance=bom.withdraw(175.25);
     System.out.println(" balance after withdraw "+balance);
     balance=bom.balanceaEnquiry(0);
     System.out.println("balance is "+balance);
	}

}
