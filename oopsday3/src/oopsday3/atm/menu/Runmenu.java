package oopsday3.atm.menu;

import oopsday3.atm.exception.NegativeAmountException;

public class Runmenu {

	public static void main(String[] args) { //throws NegativeAmountException {
		// TODO Auto-generated method stub
     BankMenu bank=new BankMenu();
    
		try {
			bank.menu();
		} catch (NegativeAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}

}
