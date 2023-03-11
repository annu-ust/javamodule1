package oopsday2.atm;

public class BankTransaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(101,"John Doe","Savings",500);
		Account a2=new Account(102,"John Doe","Savings",700);
		Account a3=new Account(103,"John Doe","Salary",800);
		Account a4=new Account(104,"John Doe","Salary",900);
		Account a5=new Account(105,"John Doe","Pension",600);
		BankofAmerica2 boa=new BankofAmerica2();
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
		System.out.println(boa.balanceaEnquiry(103));
		double result=boa.deposite(100, 101);
		System.out.println(result);
		 result=boa.withdraw(200, 102);
		System.out.println(result);
		

	}

}
