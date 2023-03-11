package oopsday2.atm;

public class BankofAmerica2 implements BankingIface2 {
	private Account accounts[] = new Account[5];
	private int accountIndex = 0;

	public BankofAmerica2() {
		// TODO Auto-generated constructor stub
	}

	public BankofAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length) {
			accounts[this.accountIndex++] = account;
		} else
			System.out.println("operation not allowed..");
	}

	@Override
	public double withdraw(double amount, int acctno) {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				tempBal = accounts[i].getBalance();
			    tempBal -= amount;
			accounts[i].setBalance(tempBal);
			
		}}
		return tempBal;
	}

	@Override
	public double deposite(double amount, int acctno) {
		// TODO Auto-generated method stubs
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				tempBal = accounts[i].getBalance();
			
			tempBal += amount;
			accounts[i].setBalance(tempBal);
			break;
		}}
		return tempBal;
	}

	@Override
	public double balanceaEnquiry(int actno) {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno()==actno)
			{
				tempBal = accounts[i].getBalance();
				break;
			}
			
		}
		return tempBal;
	}

}
